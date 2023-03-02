package com.example.a3listviewbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //có thể dùng list hoặc dùng resources.getString array đều được, resources ở trong string.xml, là 1 tag
        var mangMonHoc :MutableList<String> = mutableListOf("IOS","Android","PHP","React")
        var arrmonhoc = resources.getStringArray(R.array.arrMonhoc)
        var listview:ListView = findViewById(R.id.listview)
        for(i in 0..arrmonhoc.size-1)
            mangMonHoc.add(arrmonhoc[i])
        listview.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,mangMonHoc)
        listview.setOnItemClickListener { adapterView, view, i, l ->
//            listview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,arrmonhoc) }
            Toast.makeText(this, "bạn chọn "+mangMonHoc[i], Toast.LENGTH_LONG).show()
        }
    }
}