package com.example.ankush_1st

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

lateinit var raman:RadioButton
    lateinit var ankush:RadioButton
    lateinit var vijay:RadioButton
    lateinit var btn:Button
    lateinit var result:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        raman=findViewById(R.id.raman)as RadioButton
        ankush=findViewById(R.id.Ankush)as RadioButton
        vijay=findViewById(R.id.vijay)as RadioButton
        btn=findViewById(R.id.btn1)as Button
        result=findViewById(R.id.textView2)as TextView


btn1.setOnClickListener(View.OnClickListener {
    var Result="Your Name is:"
    if(raman.isChecked)
        Result+="Raman"
    if(Ankush.isChecked)
    Result+="Ankush"
    if(vijay.isChecked)
    Result+="Vijay"

    textView2.text=Result
})


    }
}
