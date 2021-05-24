package sk.uniza.fri.simko.semestralka

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_question.*
import sk.uniza.fri.simko.semestralka.model.*
import kotlin.random.Random

class QuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var aCurrentPosition: Int = 1
    private var aQuestionsList: ArrayList<question>? = null
    private var aSelectedOptionId: Int  = 0
    private var aCorrectAnswers: Int = 0
    private var aCategory: String = ""
    //private lateinit var viewModel: GameViewModel
    //private val viewModel: GameViewModel by viewModels()
    //private val viewModel = ViewModelProvider(this, SingletonNameViewModelFactory).get(GameViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        setCategory()
        setQuestion()

        txt_option_1.setOnClickListener(this)
        txt_option_2.setOnClickListener(this)
        txt_option_3.setOnClickListener(this)
        txt_option_4.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    private fun setCategory(){

        aCategory = intent.getStringExtra(constants.CATEGORY).toString()

        when(aCategory){
            constants.CATEGORY_FLAGS -> aQuestionsList = questionListFlags.getFlagQuestions()
            constants.CATEGORY_SIGNS -> aQuestionsList = questionListSigns.getSignQuestions()
            constants.CATEGORY_BRANDS -> aQuestionsList = questionListBrands.getBrandQuestions()
            constants.CATEGORY_CARS -> aQuestionsList = questionListCars.getCarQuestions()
            constants.CATEGORY_SHUFFLE -> createShuffleList()
            else -> aQuestionsList = questionListFlags.getFlagQuestions()
        }
    }

    private fun setQuestion(){
        val question = aQuestionsList!![aCurrentPosition - 1]

        defaultOptionView()

        if (aCurrentPosition == aQuestionsList!!.size){
            btn_submit.text = "UKONČIŤ"
        } else {
            btn_submit.text = "ODPOVEDAŤ"
        }

        progress_bar.progress = aCurrentPosition
        txt_progress.text = "$aCurrentPosition" + "/" + progress_bar.max

        txt_question.text = question!!.question
        img_question.setImageResource(question.image)
        txt_option_1.text = question.answer1
        txt_option_2.text = question.answer2
        txt_option_3.text = question.answer3
        txt_option_4.text = question.answer4
    }

    private fun createShuffleList(){
        var list = ArrayList<question>()
        var list1 = questionListFlags.getFlagQuestions()
        var list2 = questionListSigns.getSignQuestions()
        var list3 = questionListBrands.getBrandQuestions()
        var list4 = questionListCars.getCarQuestions()
        var num: Int
        var question = list1.random()
        var duplicit = true

        for (i in 1..10){
            num = Random.nextInt(1,4)
            when(num){
                1 -> {
                    question = list1.random()
                    duplicit = true
                    while(duplicit){
                        if (list.contains(question))
                            question = list1.random()
                        else
                            duplicit = false
                    }
                    list.add(question)
                }
                2 -> {
                    question = list2.random()
                    duplicit = true
                    while(duplicit){
                        if (list.contains(question))
                            question = list2.random()
                        else
                            duplicit = false
                    }
                    list.add(question)
                }
                3 -> {
                    question = list3.random()
                    duplicit = true
                    while(duplicit){
                        if (list.contains(question))
                            question = list3.random()
                        else
                            duplicit = false
                    }
                    list.add(question)
                }
                4 -> {
                    question = list4.random()
                    duplicit = true
                    while(duplicit){
                        if (list.contains(question))
                            question = list4.random()
                        else
                            duplicit = false
                    }
                    list.add(question)
                }
            }
        }
        aQuestionsList = list
    }

    private fun defaultOptionView(){
        val options = ArrayList<TextView>()
        options.add(0, txt_option_1)
        options.add(1, txt_option_2)
        options.add(2, txt_option_3)
        options.add(3, txt_option_4)

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
                txt_option_1.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                txt_option_2.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                txt_option_3.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                txt_option_4.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.txt_option_1 -> {
                selectedOptionView(txt_option_1,1)
            }
            R.id.txt_option_2 -> {
                selectedOptionView(txt_option_2,2)
            }
            R.id.txt_option_3 -> {
                selectedOptionView(txt_option_3,3)
            }
            R.id.txt_option_4 -> {
                selectedOptionView(txt_option_4,4)
            }
            R.id.btn_submit -> {
                if (aSelectedOptionId == 0){
                    aCurrentPosition++

                    when{
                        aCurrentPosition <= aQuestionsList!!.size -> {
                            setQuestion()
                        } else -> {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(constants.CORRECT_ANSWERS, aCorrectAnswers)
                            intent.putExtra(constants.TOTAL_QUESTIONS, aQuestionsList!!.size)
                            intent.putExtra(constants.CATEGORY, aCategory)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = aQuestionsList?.get(aCurrentPosition - 1)

                    //oznacenie odpovede ak je nespravna
                    if (question!!.correctAnswer != aSelectedOptionId){
                        answerView(aSelectedOptionId, R.drawable.option_incorrect)
                    } else {
                        aCorrectAnswers++
                    }

                    //oznacenie spravnej odpovede
                    answerView(question.correctAnswer, R.drawable.option_correct)

                    //kontrola ci som na poslednej otazke
                    if (aCurrentPosition == aQuestionsList!!.size){
                        btn_submit.text = "UKONČIŤ"
                    } else {
                        btn_submit.text = "ĎALŠIA OTÁZKA"
                    }
                    aSelectedOptionId = 0
                }
            }
        }
    }
}