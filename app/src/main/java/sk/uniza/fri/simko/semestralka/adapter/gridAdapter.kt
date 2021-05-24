package sk.uniza.fri.simko.semestralka.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import sk.uniza.fri.simko.semestralka.R
import sk.uniza.fri.simko.semestralka.model.gridItem

class gridAdapter(var context: Context, var arrayList: ArrayList<gridItem>): BaseAdapter() {

    override fun getItem(p0: Int): Any {
        return arrayList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view: View = View.inflate(context, R.layout.grid_item, null)
        var icons: ImageView = view.findViewById(R.id.img_grid_item)
        var names: TextView = view.findViewById(R.id.txt_grid_item)
        var listItem: gridItem = arrayList.get(p0)

        icons.setImageResource(listItem.icon!!)
        names.text = listItem.name

        return view
    }
}