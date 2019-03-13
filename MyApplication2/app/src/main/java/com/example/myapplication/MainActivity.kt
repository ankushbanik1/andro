package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
     lateinit var btn_1:Button
    lateinit var text_1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         var btn_1= findViewById(R.id.btn_1)as Button
        btn_1.setOnClickListener(View.OnClickListener{
            btn_1.text="button clicked"

            var text_1=findViewById(R.id.text_1)as TextView

            text_1.text="ateinit var btn_1:Button\n" +
                    "    lateinit var text_1:TextView\n" +
                    "    override fun onCreate(savedInstanceState: Bundle?) {\n" +
                    "        super.onCreate(savedInstanceState)\n" +
                    "        setContentView(R.layout.activity_main)\n" +
                    "         var btn_1=findViewById(R.id.btn_1)as Button\n" +
                    "        btn_1.setOnClickListener(View.OnClickListener{\n" +
                    "            btn_1.text=\"button clicked\"\n" +
                    "" +
                    "            var text_1=findViewById(R.id.text_1)as TextView\n"



            text_1.setSingleLine()
            text_1.ellipsize=TextUtils.TruncateAt.MARQUEE
            text_1.marqueeRepeatLimit=-1
            text_1.isSelected=true
        })


    }
}
