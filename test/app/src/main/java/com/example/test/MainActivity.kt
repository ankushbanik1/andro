package com.example.test

import android.app.Notification
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
lateinit var textvie:TextView

    private  var mDrawableToggle :ActionBarDrawerToggle?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      mDrawableToggle= ActionBarDrawerToggle(this,dra,toolbar1,R.string.open,R.string.close)
        mDrawableToggle!!.syncState()
    }
    fun update(view: View){
       textvie.text=(view as TextView).text
    }
}
