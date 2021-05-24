package sk.uniza.fri.simko.semestralka

import android.content.Intent
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //mModel = ViewModelProviders.of(this, SingletonNameViewModelFactory).get(GameViewModel::class.java)

        window.decorView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN

        btn_play.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
            //finish()
        }

        btn_history.setOnClickListener {
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }
    }
}