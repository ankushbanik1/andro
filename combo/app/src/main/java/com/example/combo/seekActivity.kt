package com.example.combo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_seek.*

lateinit var seek: SeekBar
lateinit var resultt: TextView
class seekActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek)
     seek=findViewById(R.id.seekbar)as SeekBar
      resultt=findViewById(R.id.textv2)as TextView
     seekbar.max=100
        seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textv2.text="your grade Now At:"+progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
textv2.text="your Grade is Seeking to:"+seekBar.progress

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                resultt.text="your Final Grade At:"+seekBar.progress
            }

        }
        )



    }
}
