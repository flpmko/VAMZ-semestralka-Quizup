package sk.uniza.fri.simko.semestralka.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_item.view.*
import sk.uniza.fri.simko.semestralka.R
import sk.uniza.fri.simko.semestralka.database.Score

class recyclerAdapter(private val context: Context, private val scores: List<Score>, private var gameID: Int = 0) : RecyclerView.Adapter<recyclerAdapter.ScoreViewHolder>() {

    class ScoreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var gameID: TextView = itemView.txt_game_id
        var category: TextView = itemView.txt_category
        var correctAnswers: TextView = itemView.txt_correct_answers

        fun nastavHodnoty(score: Score, gameID: Int) {
            category.text = score.category
            correctAnswers.text = score.score.toString()
            this.gameID.text = gameID.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScoreViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return ScoreViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ScoreViewHolder, position: Int) {
        gameID++
        holder.nastavHodnoty(scores[position], gameID)
    }

    override fun getItemCount(): Int = scores.size
}