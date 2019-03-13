package com.example.myapplication
import android.widget.AdapterView
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class spinnerActivity : AppCompatActivity() {
lateinit var show:Spinner
lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        show=findViewById(R.id.spinner1)as Spinner
        result=findViewById(R.id.textview1)as TextView

        val options= arrayOf("option 1","option 2 ","option 3")
show.adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)
//show.adapter= Array<String>(this,android.R.layout.simple_list_item_1,options)
        show.onItemSelectedListener=object:AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {


            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            }


            override fun onNothingSelected(parent: AdapterView<*>?) {
                result.text="the  option is selected"     }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            result.text=options.get(position)

            }

        }

    }
}
