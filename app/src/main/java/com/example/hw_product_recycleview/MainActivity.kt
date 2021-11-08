package com.example.hw_product_recycleview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.datasource.data
import com.example.hw_product_recycleview.smartPhone.Smart_phone_adapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataValues = data().loadingData()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
      recyclerView.adapter = Smart_phone_adapter(applicationContext,dataValues)
        recyclerView.setHasFixedSize(true)


    }
}