package sk.uniza.fri.simko.semestralka

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quick_death.*
import sk.uniza.fri.simko.semestralka.model.*
import kotlin.random.Random

class QuickDeathActivity : AppCompatActivity(), View.OnClickListener {

    private var aSelectedOptionId: Int  = 0
    private var aCorrectAnswers: Int = 0
    private var aQuestion: question? = null
    private val aCategory = constants.CATEGORY_DEATH
    private var aContinue = true
    //private lateinit var viewModel: GameViewModel
    //private val viewModel: GameViewModel by viewModels()
    //private val viewModel = ViewModelProvider(this, SingletonNameViewModelFactory).get(GameViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quick_death)

        setQuestion()

        txt_option_1_qd.setOnClickListener(this)
        txt_option_2_qd.setOnClickListener(this)
        txt_option_3_qd.setOnClickListener(this)
        txt_option_4_qd.setOnClickListener(this)
        btn_submit_qd.setOnClickListener(this)
    }

    private fun setQuestion(){
        val num = Random.nextInt(1,4)
        when(num) {
            1 -> aQuestion = questionListFlags.getRandomFlagQuestion()
            2 -> aQuestion = questionListSigns.getRandomSignQuestion()
            3 -> aQuestion = questionListBrands.getRandomBrandQuestion()
            4 -> aQuestion = questionListCars.getRandomCarQuestion()
        }

        defaultOptionView()

        txt_question_qd.text = aQuestion!!.question
        img_question_qd.setImageResource(aQuestion!!.image)
        txt_option_1_qd.text = aQuestion!!.answer1
        txt_option_2_qd.text = aQuestion!!.answer2
        txt_option_3_qd.text = aQuestion!!.answer3
        txt_option_4_qd.text = aQuestion!!.answer4
    }

    private fun defaultOptionView(){
        val options = ArrayList<TextView>()
        options.add(0, txt_option_1_qd)
        options.add(1, txt_option_2_qd)
        options.add(2, txt_option_3_qd)
        options.add(3, txt_option_4_qd)

        for (option in options){
            option.setTextColor(Color.parseColor("#5e6472"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.option_default)
        }
    }

    private fun selectedOptionView(txt: TextView, selectedOption: Int){
        defaultOptionView()
        aSelectedOptionId = selectedOption
        txt.setTextColor(Color.parseColor("#161a1d"))
        txt.typeface = Typeface.DEFAULT_BOLD
        txt.background = ContextCompat.getDrawable(this, R.drawable.option_selected)
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 -> {
                txt_option_1_qd.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                txt_option_2_qd.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                txt_option_3_qd.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                txt_option_4_qd.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.txt_option_1_qd -> {
                selectedOptionView(txt_option_1_qd,1)
            }
            R.id.txt_option_2_qd -> {
                selectedOptionView(txt_option_2_qd,2)
            }
            R.id.txt_option_3_qd -> {
                selectedOptionView(txt_option_3_qd,3)
            }
            R.id.txt_option_4_qd -> {
                selectedOptionView(txt_option_4_qd,4)
            }
            R.id.btn_submit_qd -> {
                if (aSelectedOptionId == 0){

                    if (aContinue)
                        setQuestion()
                     else {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(constants.CORRECT_ANSWERS, aCorrectAnswers)
                            intent.putExtra(constants.TOTAL_QUESTIONS, aCorrectAnswers)
                            intent.putExtra(constants.CATEGORY, aCategory)
                            startActivity(intent)
                            finish()
                        }

                } else {

                    //oznacenie odpovede ak je nespravna
                    if (aQuestion!!.correctAnswer != aSelectedOptionId){
                        answerView(aSelectedOptionId, R.drawable.option_incorrect)
                        btn_submit_qd.text = "UKONČIŤ"
                        aContinue = false
                    } else {
                        aCorrectAnswers++
                        btn_submit_qd.text = "ĎALŠIA OTÁZKA"
                    }

                    //oznacenie spravnej odpovede
                    answerView(aQuestion!!.correctAnswer, R.drawable.option_correct)

                    aSelectedOptionId = 0
                }
            }
        }
    }
}