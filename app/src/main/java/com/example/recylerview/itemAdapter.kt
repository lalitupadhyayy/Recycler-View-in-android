package com.example.recylerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.color.utilities.ViewingConditions
import org.w3c.dom.Text

class itemAdapter(val dataList: ArrayList<ModelClass>, val context: Context): RecyclerView.Adapter<itemAdapter.ViewHolder>() {
    class ViewHolder(view:View): RecyclerView.ViewHolder(view) {
        val image:ImageView = view.findViewById(R.id.image)
        val nametxt:TextView = view.findViewById(R.id.nametxt)
        val phonetxt:TextView = view.findViewById(R.id.numbertxt)
        val cardView = view.findViewById<CardView>(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val module = dataList[position]

        holder.image.setImageResource(module.image)
        holder.nametxt.text = module.name
        holder.phonetxt.text = module.phone_no

        holder.cardView.setOnClickListener{
            Toast.makeText(context, "${module.name}", Toast.LENGTH_SHORT).show()
        }
    }

}
