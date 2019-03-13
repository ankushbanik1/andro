package com.example.sharedprefrence

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mypref=preference(this)
        var getcount1 =mypref.getcount()
        getcount1++
        mypref.setcount(getcount1)
        text1.text=getcount1.toString()

    }
}
