package com.example.autocompletetext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var suggestions= arrayOf("ankush","baisali","rihita","arup","jalis")
        var adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,suggestions)
autotext1.threshold=0
        autotext1.setAdapter(adapter)
}

}