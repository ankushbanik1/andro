package com.example.ankush2nd

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.childrayout.view.*

class MainActivity : AppCompatActivity() {


    lateinit var country:RecyclerView



    var countries:MutableList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loaddata()
        setContentView(R.layout.activity_main)
        var country_list = findViewById(R.id.country_list) as RecyclerView

        //country_list.layoutManager=LinearLayoutManager(this)
        country_list.layoutManager=GridLayoutManager(this,2)
        country_list.adapter=countryAdapter(countries,this)

    }
        class countryAdapter(items:List<String>,ctx:Context):RecyclerView.Adapter<countryAdapter.ViewHolder>(){
            var  List=items
            var context=ctx

            override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
            return  ViewHolder(LayoutInflater.from(context).inflate(R.layout.childrayout,p0,false))

            }

            override fun getItemCount(): Int {

             return List.size

            }

            override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
              p0?.name?.text=List.get(p1)

            }

            class ViewHolder(v:View):RecyclerView.ViewHolder(v){
             var name=v.county_name
            }











    }
    fun loaddata(){

        countries.run {
            add("india")
            add("bangladesh")
            add("india")
            add("iran")
            add("iranita")
            add("rahuhn")
            add("izrail")
            add("pakistan")
            add("kasmir")
            add("rassia")
            add("kolkata")
            add("china")
            add("afganistan")
            add("japan")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
            add("india")
        }
    }
}
