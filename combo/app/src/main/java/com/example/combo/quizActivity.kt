package com.example.combo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_quiz.*

class quizActivity : AppCompatActivity() {
lateinit var btn5:Button
    lateinit var r1:RadioButton
    lateinit var r2:RadioButton
    lateinit var r3:RadioButton
    lateinit var r4:RadioButton
    lateinit var textv3:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        btn5=findViewById(R.id.btn5)as Button
        r1=findViewById(R.id.r1)as RadioButton
        r2=findViewById(R.id.r2)as RadioButton
        r3=findViewById(R.id.r3)as RadioButton
        r4=findViewById(R.id.r4)as RadioButton
        textv3=findViewById(R.id.textv3)as TextView

        btn5.setOnClickListener({
            var result=""


            if (r1.isChecked) {
                result += "your Answar is: Diamond\n"
                 if (r2.isChecked)
                    result += "your Answar is: True Love\n"
                 if (r3.isChecked)
                    result += "your Answar is: Lambargini\n"
               if (r4.isChecked)
                    result += "your Answar is: Gold\n"}
                textv3.text = result
            })
        }
    }

