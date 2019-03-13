package com.example.ankush3rd

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button1=findViewById<Button>(R.id.button1)
        button1.setOnClickListener({
            var intent=Intent(this,secondActivity::class.java)
        startActivity(intent)
        })

    }
}
