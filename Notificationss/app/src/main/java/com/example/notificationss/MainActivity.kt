package com.example.notificationss

import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RemoteViews
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder
import java.security.KeyStore

class MainActivity : AppCompatActivity() {

    lateinit var notificationChannel: NotificationChannel
    lateinit var notificationManager: NotificationManager
    lateinit var builder: Notification.Builder
    private var channelid="com.example.notificationss"
    private var description="Test Notification"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            notificationManager=getSystemService(Context.NOTIFICATION_SERVICE)as NotificationManager
notify.setOnClickListener({
val contentView=RemoteViews(packageName,R.layout.notification)
    contentView.setTextViewText(R.id.textv1,"AnkushbanikOfficial")

    contentView.setTextViewText(R.id.textv2,"New Update  sir")
    var intent= Intent(this,MainActivity::class.java)
    val pendingIntent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT)

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        notificationChannel= NotificationChannel(channelid,description,NotificationManager.IMPORTANCE_HIGH)
        notificationChannel.enableLights(true)
        notificationChannel.lightColor= Color.GREEN
        notificationChannel.enableVibration(true)
        notificationManager.createNotificationChannel(notificationChannel)
    builder=Notification.Builder(this,channelid)
        .setContent(contentView)
        .setSmallIcon(R.mipmap.ic_launcher_round)
        .setLargeIcon(BitmapFactory.decodeResource(this.resources,R.mipmap.ic_launcher))
        .setContentIntent(pendingIntent)
    }
    else{
        builder=Notification.Builder(this)
            .setContentTitle("AnkushbanikOfficial")
            .setContentText("Test Notification")
            .setSmallIcon(R.mipmap.ic_launcher_round)
            .setLargeIcon(BitmapFactory.decodeResource(this.resources,R.mipmap.ic_launcher))
            .setContentIntent(pendingIntent)
    }
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
        notificationManager.notify(1234,builder.build())
    }

})}}
