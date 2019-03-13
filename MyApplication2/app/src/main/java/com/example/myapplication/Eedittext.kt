package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_eedittext.*

class Eedittext : AppCompatActivity() {
    lateinit var tv_result: TextView
    lateinit var edit: EditText
    lateinit var btn_copy: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eedittext)
        edit=findViewById(R.id.edittext)as EditText
        tv_result=findViewById(R.id.textview1)as TextView

        btn_3.setOnClickListener(View.OnClickListener {
            tv_result.text=edittext.text
        })
        edittext.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                tv_result.text=edittext.text
            }

        })
    }


}
