package com.example.ankush_1st

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edittext.*

class edittext2Activity() : AppCompatActivity() {

    lateinit var edittext: EditText
    lateinit var showResult: TextView
    lateinit var btn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edittext)

        edittext = findViewById(R.id.Edit1) as EditText
        btn2.setOnClickListener(View.OnClickListener {
            textView3.text = edittext.text

            edittext.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    textView3.text = s
                }

                override fun afterTextChanged(s: Editable?) {


                }
            })
        })
        btn2.setOnClickListener{
            Log.i("edittext2Activity","invalied entry")
            Toast.makeText(this, "invalied entry", Toast.LENGTH_SHORT).show()
        }
    }
}

