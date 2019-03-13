package com.example.dialogbox

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder = AlertDialog.Builder(this)
        val dialogview = layoutInflater.inflate(R.layout.customdialog, null)
        val edit1 = findViewById<EditText>(R.id.edit1)
        builder.setView(dialogview)
        builder.setCancelable(false)
        builder.setPositiveButton("yes", { dialogInterface: DialogInterface, i: Int -> })
        builder.show()
        val customdialog1 = builder.create()
        customdialog1.show()

        customdialog1.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener({
            if (edit1.text.length < 5)
                customdialog1.dismiss()
            else
                Toast.makeText(baseContext, "you are valid", Toast.LENGTH_LONG).show()
        })


    }
}
