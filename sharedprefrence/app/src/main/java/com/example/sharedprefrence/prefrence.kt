package com.example.sharedprefrence

import android.content.Context

class preference(context:Context){
    val name="MY PREFERENCE"
    val key="MY PREFERENCE_key"

    val preference1=context.getSharedPreferences(name,Context.MODE_PRIVATE)

    fun getcount():Int{
        return preference1.getInt(key,0)
    }

    fun  setcount(count:Int){
        val editor = preference1.edit()
        editor.putInt(key,count)
        editor.apply()
    }
}
