package com.example.contentprovider

import android.content.ContentResolver
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun content(){
            var cursor=ContentResolver.query(ContactsContract.Contacts.CONTENT_URI,null,null,null,null)
        if (cursor!=null&& cursor.movieto)
        }

    }
}
