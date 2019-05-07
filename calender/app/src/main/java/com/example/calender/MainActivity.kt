package com.example.calender

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private val dateFormat = SimpleDateFormat("dd MMM yyyy", Locale.US)
    private val timeFormat= SimpleDateFormat("hh:mm a",Locale.US)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val now=Calendar.getInstance()
        btn_date.text= dateFormat.format(now.time)
        btn_time.text= timeFormat.format(now.time)

btn_date.setOnClickListener {
    val datepicker=DatePickerDialog(
        this,DatePickerDialog.OnDateSetListener {_,year,month,dayOfMonth ->
            now.set(Calendar.YEAR,year)
            now.set(Calendar.MONTH,month)
            now.set(Calendar.DAY_OF_MONTH,dayOfMonth)

            btn_date.text=dateFormat.format(now.time)

        },
        now.get(Calendar.YEAR),now.get(Calendar.MONTH),now.get(Calendar.DAY_OF_MONTH)
    )
datepicker.show()
}


      btn_time.setOnClickListener {

          val timepicker = TimePickerDialog(
              this, TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->

                  now.set(Calendar.HOUR_OF_DAY, hourOfDay)
                  now.set(Calendar.MINUTE, minute)
                  btn_time.text = timeFormat.format(now.time)
              },
              now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE), false

          )
      timepicker.show()



      }
    }
}
