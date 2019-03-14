package com.example.sqlliteconnect

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var context=this
        var db = databasehandel(context)
        btn1.setOnClickListener({
            if (edit1.text.toString().length > 0 &&
                edit2.text.toString().length > 0) {
                var user = User(edit1.text.toString(),edit2.text.toString().toInt())
                db.insert
            } else {
                Toast.makeText(context,"Please Fill All Data's",Toast.LENGTH_SHORT).show()   })

    })
    }}

