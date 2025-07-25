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

        dataList.add(ModelClass(R.drawable.recyclericon,"Bharat","728988***9"))
        dataList.add(ModelClass(R.drawable.recyclericon2,"Lalit","928911***9"))
        dataList.add(ModelClass(R.drawable.recyclericon3,"Chacha ji","997164***9"))
        dataList.add(ModelClass(R.drawable.recyclericon5,"Saniya","894587***9"))

        dataList.add(ModelClass(R.drawable.recyclericon,"Papa ji","992727***4"))
        dataList.add(ModelClass(R.drawable.recyclericon2,"Mama ji","805780***2"))
        dataList.add(ModelClass(R.drawable.recyclericon3,"Nana ji","976017***0"))
        dataList.add(ModelClass(R.drawable.recyclericon5,"Mami ji","894587***9"))

        itemAdapter = itemAdapter(dataList,this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = itemAdapter
    }
}