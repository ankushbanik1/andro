package com.example.progressbar

import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onBackPressed() {
        val builder=AlertDialog.Builder(this)
        builder.setTitle("want to quit app?")

        builder.setMessage("Are You Sure?")
        builder.setPositiveButton("Yes",{ dialogInterface: DialogInterface, i: Int ->
            finish()
        })
        builder.setNegativeButton("No",{ dialogInterface: DialogInterface, i: Int -> })
    builder.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        val progressBar=ProgressDialog(this)
//        progressBar.setMessage("Downloading....")
//        progressBar.setCancelable(false)
//        progressBar.show()

        val builderr=AlertDialog.Builder(this)
        val dialogview =layoutInflater.inflate(R.layout.progressbarlayout,null)
        builderr.setView(dialogview)
        builderr.setCancelable(false)
        val dialog=builderr.create()
builderr.show()
        Handler().postDelayed({dialog.dismiss()},5000)

    }
}
