package com.example.webview2

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
 var context= this


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var suggestions= arrayOf("google.com","facebook.com","youtube.com")
        var adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,suggestions)

autotext.threshold=0
        autotext.setAdapter(adapter)

        web1.webViewClient = mywebclint()
        btngo.setOnClickListener({
            web1.loadUrl("https://" + autotext.text.toString())

        })
        btnback.setOnClickListener(
            {
                if (web1.canGoBack())
                    web1.goBack()
                else
                    Toast.makeText(context, "history Not Available!!", Toast.LENGTH_SHORT).show()
            }
        )
    }
        @Suppress("OverridingDeprecatedMember")
        class mywebclint:WebViewClient(){
            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
               view?.loadUrl(request?.url.toString())
                return true


            }

            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }


    }

