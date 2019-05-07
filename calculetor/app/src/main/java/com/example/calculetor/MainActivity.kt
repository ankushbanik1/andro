package com.example.calculetor

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
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
        //numbers..
        tv_1.setOnClickListener { appentOnExpression("1",true) }
        tv_1.setOnClickListener { appentOnExpression("1",true) }
        tv_2.setOnClickListener { appentOnExpression("2",true) }
        tv_3.setOnClickListener { appentOnExpression("3",true) }
        tv_4.setOnClickListener { appentOnExpression("4",true) }
        tv_5.setOnClickListener { appentOnExpression("5",true) }
        tv_6.setOnClickListener { appentOnExpression("6",true) }
        tv_7.setOnClickListener { appentOnExpression("7",true) }
        tv_8.setOnClickListener { appentOnExpression("8",true) }
        tv_9.setOnClickListener { appentOnExpression("9",true) }
        tv_0.setOnClickListener { appentOnExpression("0",true) }
        tv_dot.setOnClickListener { appentOnExpression(".",true) }

        //operaters

        tv_divide.setOnClickListener { appentOnExpression("/",false) }
        tv_plus.setOnClickListener { appentOnExpression("+",false) }
        tv_minus.setOnClickListener { appentOnExpression("-",false) }
        tv_x.setOnClickListener { appentOnExpression("*",false) }
        tv_percent.setOnClickListener { appentOnExpression("%",false) }

        tv_back.setOnClickListener { appentOnExpression("<",false) }

    tv_exp.setOnClickListener {
        tv_exp.text=""
        tv_result.text=""

    }
        tv_c.setOnClickListener {
            val string = tv_exp.text.toString()
            if (string.isEmpty()) {
                tv_exp.text = string.substring(0, string.length - 1)
            }
            tv_result.text = ""
        }
            tv_back.setOnClickListener {
            val string=tv_exp.text.toString()
            if (string.isEmpty()){
                tv_exp.text=string.substring(0,string.length-1)
            }
            tv_result.text=""
            }





//tv_ac.setOnClickListener {
//    val string = tv_exp.text.toString()
//    if (string.isEmpty()) {
//        tv_exp.text = string.substring(0, string.length - 1)
//    }
//    tv_exp.text = ""
//}
tv_equalto.setOnClickListener {
    try {
        val expression = ExpressionBuilder(tv_exp.text.toString()).build()
        val result = expression.evaluate()
        val long = result.toLong()
        if (result == long.toDouble())
            tv_result.text = long.toString()
        else
            tv_result.text = result.toString()

}catch (e:Exception){
        Log.d("Exception"," message : " + e.message )


    }
}

}





fun appentOnExpression(string:String,canClear:Boolean){
if (canClear){
    tv_result.text=""
    tv_exp.append(string)
}else{
    tv_exp.append(tv_result.text)
    tv_exp.append(string)
    tv_result.text=""

}
}
}
