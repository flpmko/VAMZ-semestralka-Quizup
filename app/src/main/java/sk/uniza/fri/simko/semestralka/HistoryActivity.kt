package sk.uniza.fri.simko.semestralka

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_history.*
import sk.uniza.fri.simko.semestralka.adapter.recyclerAdapter
import sk.uniza.fri.simko.semestralka.database.Score
import sk.uniza.fri.simko.semestralka.database.ScoreDatabase

class HistoryActivity : AppCompatActivity() {

    private var list: List<Score> ? = null
    private var recyclerView: RecyclerView? = null
    private var recyclerAdapter: recyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        recyclerView = rec_view_history

        var db = ScoreDatabase.getInstance(this.applicationContext)
        list = db.scoreDatabaseDao.getAll()

        recyclerAdapter = recyclerAdapter(applicationContext, list!!)
        recyclerView?.adapter = recyclerAdapter

        btn_clear.setOnClickListener {
                db = ScoreDatabase.getInstance(this.applicationContext)
                db.scoreDatabaseDao.clear()
        }
    }
}