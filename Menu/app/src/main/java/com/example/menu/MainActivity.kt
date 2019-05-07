package com.example.menu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)

        menuInflater.inflate(R.menu.menu, menu)

        return true


    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        menu?.getItem(2)?.setEnabled(false)
        menu?.getItem(3)?.setVisible(false)
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        var selectedOptions=""

        when(item?.itemId) {
            R.id.about -> selectedOptions = "Aboutme"
            R.id.help -> selectedOptions = "Help"
            R.id.item1 -> selectedOptions = "item 1"
            R.id.item2 -> selectedOptions = "item 2"
            R.id.item3 -> selectedOptions = "item 3"
        }
        Toast.makeText(this,"Options:"+selectedOptions,Toast.LENGTH_SHORT).show()
            return super.onOptionsItemSelected(item)

        }

    }



