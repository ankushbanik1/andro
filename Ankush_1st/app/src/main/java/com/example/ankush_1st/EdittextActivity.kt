package com.example.ankush_1st

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_edittext.*

class EdittextActivity : AppCompatActivity() {
lateinit var edittext:EditText
    lateinit var showResult:TextView
    lateinit var btn:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edittext)

        edittext=findViewById(R.id.Edit1)as EditText
        btn.setOnClickListener(View.OnClickListener {
            textView3.text=edittext.text
        })
    }
}
