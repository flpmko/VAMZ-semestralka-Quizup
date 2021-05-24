package sk.uniza.fri.simko.semestralka

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_menu.*
import sk.uniza.fri.simko.semestralka.adapter.gridAdapter
import sk.uniza.fri.simko.semestralka.model.constants
import sk.uniza.fri.simko.semestralka.model.gridItem

class Menu : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var arrayList: ArrayList<gridItem> ? = null
    private var gridView: GridView? = null
    private var gridAdapter: gridAdapter ? = null
    //private lateinit var viewModel: GameViewModel //by activityViewModels()
    //private val viewModel: GameViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        gridView = grid_view_menu
        arrayList = ArrayList()
        arrayList = fillList()
        gridAdapter = gridAdapter(applicationContext, arrayList!!)
        gridView?.adapter = gridAdapter
        gridView?.onItemClickListener = this
    }

    private fun fillList(): ArrayList<gridItem> {
        var arrayList: ArrayList<gridItem> = ArrayList()

        arrayList.add(gridItem(R.drawable.icon_flag, "Vlajky štátov", 1))
        arrayList.add(gridItem(R.drawable.icon_sign, "Dopravné značky", 2))
        arrayList.add(gridItem(R.drawable.icon_brand, "Logá firiem", 3))
        arrayList.add(gridItem(R.drawable.icon_car, "Značky áut", 4))
        arrayList.add(gridItem(R.drawable.icon_skull, "Rýchla smrť", 5))
        arrayList.add(gridItem(R.drawable.icon_shuffle, "Miš-maš", 6))

        return arrayList
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items: gridItem = arrayList!!.get(position)

        when (items.id) {
            1 -> { //VLAJKY
                Toast.makeText(applicationContext, items.name, Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionActivity::class.java)
                intent.putExtra(constants.CATEGORY, constants.CATEGORY_FLAGS)
                startActivity(intent)
            }
            2 -> { //ZNACKY
                Toast.makeText(applicationContext, items.name, Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionActivity::class.java)
                intent.putExtra(constants.CATEGORY, constants.CATEGORY_SIGNS)
                startActivity(intent)
            }
            3 -> { //LOGA
                Toast.makeText(applicationContext, items.name, Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionActivity::class.java)
                intent.putExtra(constants.CATEGORY, constants.CATEGORY_BRANDS)
                startActivity(intent)
            }
            4 -> { //AUTA
                Toast.makeText(applicationContext, items.name, Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionActivity::class.java)
                intent.putExtra(constants.CATEGORY, constants.CATEGORY_CARS)
                startActivity(intent)
            }
            5 -> { //SMRT
                Toast.makeText(applicationContext, items.name, Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuickDeathActivity::class.java)
                startActivity(intent)
            }
            6 -> { //MISMAS
                Toast.makeText(applicationContext, items.name, Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionActivity::class.java)
                intent.putExtra(constants.CATEGORY, constants.CATEGORY_SHUFFLE)
                startActivity(intent)
            }
        }
    }
}