package com.example.services

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
val type2=2
 val type1=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intent1=Intent(this,myintentservices::class.java)
       intent1.putExtra("type",type1)

        startService(intent)
        var intent2=Intent(this,myintentservices::class.java)
        intent1.putExtra("type",type2)

        startService(intent)

    }
}
