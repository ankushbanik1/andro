package com.example.notificationss

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder
import java.security.KeyStore

class noti : AppCompatActivity() {

    lateinit var notificationManager: NotificationManager
    lateinit var notificationChannel: NotificationChannel
    lateinit var builder:Notification.Builder
     private var channelId="Ankush"
    private var description="hello sir"



override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
var intent= Intent(this,MainActivity::class.java)
  var  pendingintent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT)



notify.setOnClickListener({
    notificationManager=getSystemService(Context.NOTIFICATION_SERVICE)as NotificationManager
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        notificationChannel= NotificationChannel(channelId,description,NotificationManager.IMPORTANCE_HIGH)
        notificationChannel.enableLights(true)
notificationChannel.lightColor= Color.BLUE
        notificationChannel.enableVibration(true)
        notificationManager.createNotificationChannel(notificationChannel)
        builder=Notification.Builder(this,channelId)
            .setContentTitle("Ankush")
            .setContentText("hello sir how are you")
            .setSmallIcon(R.mipmap.ic_launcher_round)
            .setLargeIcon(BitmapFactory.decodeResource(this.resources,R.mipmap.ic_launcher))


            .setContentIntent(pendingintent)

    }else{
        builder=Notification.Builder(this)
            .setContentTitle("Ankush")
            .setContentText("hello sir how are you")
            .setSmallIcon(R.mipmap.ic_launcher_round)
            .setLargeIcon(BitmapFactory.decodeResource(this.resources,R.mipmap.ic_launcher))


            .setContentIntent(pendingintent)

    }
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
        notificationManager.notify(123,builder.build())
    }

})
}}