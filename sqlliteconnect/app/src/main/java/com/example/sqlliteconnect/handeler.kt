package com.example.sqlliteconnect

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

var DATABASENAME="mydb"
var tablename="users"
var col_name="name"
var col_age="age"
var id="id"

class databasehandel(var context: Context):SQLiteOpenHelper(context, DATABASENAME,null,1) {
    override fun onCreate(db: SQLiteDatabase?) {


        val createtable = "create table name" + tablename + "(" + id + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                col_name + "VARCHAR(256)" + col_age + "INTEGER)"

        db?.execSQL(createtable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        {
            TODO("not implemented")
        }

        fun insertData(user: User) {
            val db = this.writableDatabase
            var cv = ContentValues()
            cv.put(col_name, user.name)
            cv.put(col_age, user.age)
            var result = db.insert(tablename, null, cv)
            if (result == -1.toLong())
                Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }
    }

}

