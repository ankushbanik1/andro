package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        button2.setOnClickListener { Log.i("MainActivity","button is clicked")}
//
//        Toast.makeText(this, "button is clicked",Toast.LENGTH_SHORT).show())

button2.setOnClickListener { Log.i("MainActivity","button was clicked")
Toast.makeText(this,"button was clicked",Toast.LENGTH_LONG).show()

}

        btnuser.setOnClickListener { Toast.makeText(this," 2nd button was clicked",Toast.LENGTH_LONG).show()
       val msg:String=editTeext.text.toString()
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show()



        }
    }
}
