package com.example.recylerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var itemAdapter: itemAdapter
    lateinit var dataList: ArrayList<ModelClass>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rview)

        dataList = ArrayList()

        dataList.add(ModelClass(R.drawable.recyclericon,"Bharat","7289889009"))
        dataList.add(ModelClass(R.drawable.recyclericon2,"Lalit","9289114909"))
        dataList.add(ModelClass(R.drawable.recyclericon3,"Chacha ji","9971649909"))
        dataList.add(ModelClass(R.drawable.recyclericon5,"Saniya","8945871209"))

        dataList.add(ModelClass(R.drawable.recyclericon,"Papa ji","9927279244"))
        dataList.add(ModelClass(R.drawable.recyclericon2,"Mama ji","8057803232"))
        dataList.add(ModelClass(R.drawable.recyclericon3,"Nana ji","9760170200"))
        dataList.add(ModelClass(R.drawable.recyclericon5,"Mami ji","8945871209"))

        itemAdapter = itemAdapter(dataList,this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = itemAdapter
    }
}