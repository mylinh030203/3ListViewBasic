package com.example.a3listviewbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_add_item_for_listview.*

class addItemForListview : AppCompatActivity() {

    var hten:MutableList<String> = mutableListOf("Phan Văn An","Nguyễn Ngọc Anh")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item_for_listview)
        lvname.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, hten)
        addEvent()
    }
    private fun addEvent(){
        btnnhap.setOnClickListener{
            addName()
        }
    }
    private fun addName(){
        hten.add(etnhap.text.toString())
        etnhap.setText("")
        lvname.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,hten)

    }
}