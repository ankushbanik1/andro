package com.example.helloapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener{
           val msg:String=userinput.text.toString()
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()

            val intent=Intent(this,secondapp::class.java)
            intent.putExtra("ankush",msg)
            startActivity(intent)
        }
share2.setOnClickListener{
    val msgg:String=userinput.text.toString()

    val intent=Intent()
    intent.action=Intent.ACTION_SEND
    intent.putExtra(Intent.EXTRA_TEXT,msgg)
    intent.type="text/plain"
    startActivity(Intent.createChooser(intent,"choose your option"))

}
    }
}
