package com.example.alarmmanager

import android.app.AlarmManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.ReceiverCallNotAllowedException
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
lateinit var context:Context

    lateinit var alarmManager: AlarmManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context=this
        alarmManager=getSystemService(Context.ALARM_SERVICE)as AlarmManager


        btncreate.setOnClickListener({
            var intent=Intent(context,ReceiverCallNotAllowedException
            var
        })




        class  reciver():BroadcastReceiver(){
            override fun onReceive(context: Context?, intent: Intent?) {
                Log.d("MainActivity","Reciver:"+Date().toString())
            }

        }


    }
}
