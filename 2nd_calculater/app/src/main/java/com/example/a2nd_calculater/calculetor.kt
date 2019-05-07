package com.example.a2nd_calculater

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import kotlinx.android.synthetic.main.activity_calculetor.*
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class calculetor : AppCompatActivity() {
    override fun onBackPressed() {
        val bulder = AlertDialog.Builder(this)
        bulder.setTitle("Are You sure?")
        bulder.setMessage("Do You Want to quite?")
        bulder.setPositiveButton("Yes", { dialoginterface: DialogInterface, i: Int -> })
        finish()
        bulder.setNegativeButton("No", { dialoginterface: DialogInterface, i: Int -> })

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculetor)


        fun appentExpression(string: String, canClear: Boolean) {
            if (canClear) {
                tv_result.text = ""
                tv_exp.append(string)
            } else {
                tv_exp.append(tv_result.text)
                tv_exp.append(string)
                tv_result.text = ""

            }
        }
        tv_1.setOnClickListener { appentExpression("1", true) }
        tv_2.setOnClickListener { appentExpression("2", true) }
        tv_3.setOnClickListener { appentExpression("3", true) }
        tv_4.setOnClickListener { appentExpression("4", true) }
        tv_5.setOnClickListener { appentExpression("5", true) }
        tv_6.setOnClickListener { appentExpression("6", true) }
        tv_7.setOnClickListener { appentExpression("7", true) }
        tv_8.setOnClickListener { appentExpression("8", true) }
        tv_9.setOnClickListener { appentExpression("9", true) }
        tv_zero.setOnClickListener { appentExpression("0", true) }
        not_equal.setOnClickListener { appentExpression("!", true) }
        braket1.setOnClickListener { appentExpression(")", true) }
        bracket2.setOnClickListener { appentExpression("(", true) }


        plus.setOnClickListener { appentExpression("+", false) }
        minus.setOnClickListener { appentExpression("-", false) }
        multiply.setOnClickListener { appentExpression("x", false) }
        divide.setOnClickListener { appentExpression("/", false) }


        equal.setOnClickListener {
            try {
                val expressionBuilder = ExpressionBuilder(tv_exp.text.toString()).build()
                val result = expressionBuilder.evaluate()
                val long = result.toLong()
                if (result == long.toDouble()) {
                    tv_result.text = long.toString()
                } else {
                    tv_result.text = result.toString()
                }


            } catch (e: Exception) {
                Log.d("Exception", "message:" + e.message)

            }


        }


        back.setOnClickListener {
            val back = tv_exp.text.toString()
            if (back.isEmpty()) {
                tv_result.text = back.substring(0, back.length - 1)
                tv_exp.text =""

            } else {
                tv_exp.text =back.substring(0,back.length -1)

            }
            tv_ac.setOnClickListener {
                val string = tv_result.text.toString()
                if (string.isEmpty()) {
                    tv_result.text = string.substring(0,string.length - 1)
                    tv_exp.text=""

                } else {
                    tv_result.text = ""
                    tv_exp.text=""
                }


            }

        }
    }

}