package com.example.ankush_1st

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatAutoCompleteTextView
import android.support.v7.widget.RecyclerView
import android.widget.TextView

class RecyclerActivity(var country: MutableList<String>) : AppCompatActivity() {
lateinit var Country_list:RecyclerView
    lateinit var textView5:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        Country_list=findViewById(R.id.Recyler1)as RecyclerView

    }
}
