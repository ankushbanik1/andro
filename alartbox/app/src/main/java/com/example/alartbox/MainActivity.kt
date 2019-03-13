package com.example.alartbox

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onBackPressed() {
        val builder =AlertDialog.Builder(this)
        builder.setTitle("Are You Sure?")
        builder.setMessage("Do You Want to close?")
        builder.setPositiveButton("yes",{ dialogInterface: DialogInterface, i: Int ->
            finish()


        })
        builder.setNegativeButton("No",{ dialogInterface: DialogInterface, i: Int -> })

        builder.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
