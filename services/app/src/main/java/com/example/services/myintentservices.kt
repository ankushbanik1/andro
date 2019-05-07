package com.example.services

import android.app.IntentService
import android.content.Intent
import android.util.Log
import kotlin.math.log

class myintentservices:IntentService("myintentservices") {
    override fun onHandleIntent(intent: Intent?) {
        for (i in 1..5){
            Log.d("myintentservices",intent?.getIntExtra("type",0).toString()+"app is running in background"+i)
            Thread.sleep(1000)


        }
    }
}