package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.myapplication.R.id.radiogrp2
import kotlinx.android.synthetic.main.activity_forms.view.*

class FormsActivity : AppCompatActivity() {

    lateinit var radiogrp1: RadioGroup
    lateinit var rediobtn1: RadioButton
    lateinit var rediobtn2: RadioButton
    lateinit var btn2: Button
    lateinit var checkbox0: CheckBox
    lateinit var checkbox1: CheckBox
    lateinit var checkbox2: CheckBox
    lateinit var checkbox3: CheckBox
    lateinit var textview1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forms)


        radiogrp1 = findViewById(R.id.radiogrp1) as RadioGroup
        rediobtn1 = findViewById(R.id.rediobtn1) as RadioButton
        rediobtn2 = findViewById(R.id.rediobtn2) as RadioButton
        checkbox0 = findViewById(R.id.checkbox0) as CheckBox
        checkbox1 = findViewById(R.id.checkbox1) as CheckBox
        checkbox2 = findViewById(R.id.checkbox2) as CheckBox
        checkbox3 = findViewById(R.id.checkbox3) as CheckBox
        btn2 = findViewById(R.id.btn2) as Button
        textview1 = findViewById(R.id.textview1) as TextView


        btn2.setOnClickListener(View.OnClickListener {
            var Result = ""
            if (radiogrp1.checkedRadioButtonId != -1) {
                Result += "selected gender is :"
                if (rediobtn1.isChecked)
                    Result += "male\n"
                if (rediobtn2.isChecked)
                    Result += "female\n"
            }

                Result += "Language is know to  You:"
                if (checkbox0.isChecked)
                    Result += "hindi"
                if (checkbox1.isChecked)
                    Result += "French"
                if (checkbox2.isChecked)
                    Result += "English"
                if (checkbox3.isChecked)
                    Result += "bangla"

                textview1.text = Result



        })

    }
}