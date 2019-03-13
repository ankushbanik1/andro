package com.example.combo

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.childrecycle.*
import kotlinx.android.synthetic.main.childrecycle.view.*

class RecyclerViewActivity : AppCompatActivity() {
lateinit var frind_list:RecyclerView


    var friends:MutableList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        loaddata()
        setContentView(R.layout.activity_recycler_view)

        frind_list = findViewById(R.id.Recycler1) as RecyclerView
        frind_list.layoutManager = LinearLayoutManager( this)
        frind_list.adapter = friendAdepter(friends, ctx =this)
    }
        class friendAdepter(items: List<String>, ctx: Context) : RecyclerView.Adapter<friendAdepter.viewholder>() {

            var List = items
            var Context = ctx
            override fun onCreateViewHolder(p0: ViewGroup, p1: Int): viewholder {
                return viewholder(LayoutInflater.from(Context).inflate(R.layout.childrecycle ,p0 ,false))
            }

            override fun getItemCount(): Int {
                return List.size


            }

            override fun onBindViewHolder(p0: viewholder, p1: Int) {
                p0?.name?.text =List.get(p1)

            }


            inner class viewholder(v: View) : RecyclerView.ViewHolder(v) {
                var name = v.textv4

            }
        }





        fun loaddata(){

         friends.run {   add("ankit")
             add("aman")
             add("ankit")
             add("arup")
             add("avi")
             add("devance")
             add("rohir")
             add("ankit")
             add("aman")
             add("ankit")
             add("arup")
             add("avi")
             add("devance")
             add("rohir")
             add("ankit")
             add("aman")
             add("ankit")
             add("arup")
             add("avi")
             add("devance")
             add("rohir")
             add("ankit")
             add("aman")
             add("ankit")
             add("arup")
             add("avi")
             add("devance")
             add("rohir")
             add("ankit")
             add("aman")
             add("ankit")
             add("arup")
             add("avi")
             add("devance")
             add("rohir")

             add("ankit")
             add("aman")
             add("ankit")
             add("arup")
             add("avi")
             add("devance")
             add("rohir")
             add("ankit")
             add("aman")
             add("ankit")
             add("arup")
             add("avi")
             add("devance")
             add("rohir")
             add("ankit")
             add("aman")
             add("ankit")
             add("arup")
             add("avi")
             add("devance")
             add("rohir")
             add("ankit")
             add("aman")
             add("ankit")
             add("arup")
             add("avi")
             add("devance")
             add("rohir")
             add("ankit")
             add("aman")
             add("ankit")
             add("arup")
             add("avi")
             add("devance")
             add("rohir")



         }

    }
}
