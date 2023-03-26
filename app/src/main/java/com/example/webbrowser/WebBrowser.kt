package com.example.webbrowser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebBrowser : AppCompatActivity() {

    lateinit var webBrowser:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        webBrowser = findViewById(R.id.web_browser)

        intent.getStringExtra("code")
            ?.let { webBrowser.loadData(it,  "text/html:charset=utf-8", null) }
    }
}