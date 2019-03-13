package com.example.ankush_1st

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_seekbar.*

class seekbarActivity : AppCompatActivity() {
lateinit var seek:SeekBar
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seekbar)


        seek=findViewById(R.id.seekbar1)as SeekBar
        result=findViewById(R.id.textView4)as TextView
        seek.max=100
        seek.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
         override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
             textView4.text="Seeking To:"+progress.toString()
         }




         override fun onStartTrackingTouch(seekBar: SeekBar) {

             textView4.text="Seeking To:"+seekBar.progress
         }

         override fun onStopTrackingTouch(seekBar: SeekBar) {
textView4.text="Stopped at:"+seekBar.progress
         }
     })
}}
