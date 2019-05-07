package com.example.loginscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_signup.*
import java.util.regex.Pattern
import kotlin.math.log

class signup : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        auth = FirebaseAuth.getInstance()

        btn_sign_up.setOnClickListener {
            signUpUser()
        }
    }
//
//        private fun signupuser() {
//            if (username.text.toString().isEmpty()){
//                username.error = "please Enter a email"
//            username.requestFocus()
//            return
//        }
//
//            if (Patterns.EMAIL_ADDRESS.matcher(username.text.toString()).matches()) {
//
//                username.error = "please Enter a  valid email"
//                username.requestFocus()
//                return
//            }
//
//            if (password.text.toString().isEmpty()) {
//                username.error = "please Enter a password"
//                username.requestFocus()
//                return
//
//            }
//            auth.createUserWithEmailAndPassword(username.text.toString(), password.text.toString())
//                .addOnCompleteListener(this) { task ->
//                    if (task.isSuccessful) {
//                       startActivity(Intent(this,login::class.java))
//                        finish()
//                    } else {
//                        // If sign in fails, display a message to the user.
//                        Toast.makeText(baseContext, "Authentication failed.,try again after some time",
//                            Toast.LENGTH_SHORT).show()
//
//                    }
//
//                    // ...
//                }
//        }
//
//    }
//



    private fun signUpUser() {
        if (username.text.toString().isEmpty()) {
            username.error = "Please enter email"
            username.requestFocus()
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(username.text.toString()).matches()) {
            username.error = "Please enter valid email"
            username.requestFocus()
            return
        }

        if (password.text.toString().isEmpty()) {
            password.error = "Please enter password"
            password.requestFocus()
            return
        }

        auth.createUserWithEmailAndPassword(tv_username.text.toString(), tv_password.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    startActivity(Intent(this,MainActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(baseContext, "Sign Up failed. Try again after some time.",
                        Toast.LENGTH_SHORT).show()
                }
            }
    }
}