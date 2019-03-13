package com.example.combo

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textv1.setSingleLine()
        textv1.text="WellCome Sir To our Combo App"
        textv1.isSelected=true

        btn1.setOnClickListener({
            var i =Intent(this,quizActivity::class.java)
            startActivity(i)
        })
        btn2.setOnClickListener({
            var j =Intent(this,seekActivity::class.java)
            startActivity(j)
        })

        btn6.setOnClickListener({
            var k =Intent(this,RecyclerViewActivity::class.java)
            startActivity(k)
        })



        btn4.setOnClickListener({

            intent= Intent()
            intent.action=Intent.ACTION_SEND
            intent.type="text/plain"
startActivity(Intent.createChooser(intent,"choose yourself"))
        })

    }
}
