package com.example.loginscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    val toast=this
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()
        btn_signup.setOnClickListener {
            startActivity(Intent(this,signup::class.java))
        finish()
        }


        }
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        updateUI(currentUser)

//        btn_login.setOnClickListener {
//            Toast.makeText(this,"you are unable to Login",Toast.LENGTH_LONG).show()
//        }
    }
    fun updateUI(currentuser:FirebaseUser?){

    }
}
