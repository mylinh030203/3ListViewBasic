package com.example.a3listviewbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mangMonHoc :List<String> = listOf("IOS","Android","PHP","React")
        var listview:ListView = findViewById(R.id.listview)
        listview.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,mangMonHoc)
    }
}