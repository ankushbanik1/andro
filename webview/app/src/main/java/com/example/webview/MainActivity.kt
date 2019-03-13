package com.example.webview

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webview.webViewClient = mywebclint()


        var suggestions= arrayOf("google.com","facebook.com","youtube.com")
        var adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,suggestions)

        edittext.threshold=0
        edittext.setAdapter(adapter)
        btngo.setOnClickListener({
            webview.loadUrl("https://" + edittext.text.toString())
        })
        btnback.setOnClickListener({
            if (webview.canGoBack())
                webview.goBack()
            else
                Toast.makeText(context, "no. histry availavail", Toast.LENGTH_LONG).show()


        })
        btnback.setOnClickListener({
            if (webview.canGoForward())
                webview.goForward()
            else
                Toast.makeText(context, "history availavail", Toast.LENGTH_LONG).show()

        })
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
                return  true
            }

        }
    }
