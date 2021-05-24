package sk.uniza.fri.simko.semestralka


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*
import sk.uniza.fri.simko.semestralka.database.Score
import sk.uniza.fri.simko.semestralka.database.ScoreDatabase
import sk.uniza.fri.simko.semestralka.model.constants

class ResultActivity : AppCompatActivity() {

    var correct_answers = 0
    var total_questions = 0
    var category = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //var database = Room.databaseBuilder(this, ScoreDatabase::class.java, "quizup").build().scoreDatabaseDao


        correct_answers = intent.getIntExtra(constants.CORRECT_ANSWERS, 0)
        total_questions = intent.getIntExtra(constants.TOTAL_QUESTIONS, 0)
        category = intent.getStringExtra(constants.CATEGORY).toString()

        if (category == constants.CATEGORY_DEATH)
            txt_score.text = "Tvoje skóre je $correct_answers"
        else
            txt_score.text = "Tvoje skóre je $correct_answers z $total_questions"

        feedback(correct_answers)

        /*var dbSize = db.getSize()
        db.insert(Score(dbSize++, correct_answers, category))
        Log.d("database_content", db.getAll().toString())*/

        btn_home.setOnClickListener{
            startActivity(Intent(this, Menu::class.java))
            finish()
        }

        btn_again.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra(constants.CATEGORY, category)
            startActivity(intent)
            finish()
        }
    }

    override fun finish() {
        val thread = Thread {
            var db = ScoreDatabase.getInstance(this.applicationContext)

            var score_ = Score()
            score_.category = category
            score_.score = correct_answers

            db.scoreDatabaseDao.insert(score_)

            Log.d("database_content", db.scoreDatabaseDao.getAll().toString())
        }
        thread.start()
        super.finish()
    }

    fun feedback(num_correct : Int) {
        when(num_correct){
            0 -> txt_congrats.text = "To sa ti ako podarilo?!"
            1 -> txt_congrats.text = "To ako fakt?"
            2 -> txt_congrats.text = "Mohlo to byť aj horšie"
            3 -> txt_congrats.text = "Nič moc..."
            4 -> txt_congrats.text = "Skoro! ...polovica správne"
            5 -> txt_congrats.text = "Polovica správne alebo polovica zle?"
            6 -> txt_congrats.text = "Dobre!"
            7 -> txt_congrats.text = "Ešte je čo zlepšovať!"
            8 -> txt_congrats.text = "Výborne!"
            9 -> txt_congrats.text = "Vynikajúco, skoro plný počet!"
            10 -> txt_congrats.text = "Bezchybne!"
            else -> txt_congrats.text = "Prekonávaš všetky očakávania!!"
        }
    }
}