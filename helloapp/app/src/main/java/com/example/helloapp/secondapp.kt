package com.example.helloapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_secondapp.*

class secondapp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondapp)

        val bundle:Bundle?=intent.extras
        val masg=bundle!!.getString("ankush")
Toast.makeText(this,masg,Toast.LENGTH_SHORT).show()
        textView.text=masg
    }
    }

