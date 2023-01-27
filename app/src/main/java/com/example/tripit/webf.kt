package com.example.tripit

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class webf : AppCompatActivity() {
    lateinit var mywebview:WebView
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webactivity)

        mywebview=findViewById(R.id.webView2)
        //calling the function..click on the torch then select surpress
        webview()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webview(){
        mywebview.webViewClient= WebViewClient()
//linking the home page url
        mywebview.apply {
            loadUrl("https://humanjourney.us/the-evolution-of-language-section/?gclid=Cj0KCQiA45qdBhD-ARIsAOHbVdEtMwKUS_6vOXODBBrF6cec4dK9l64_JQbP3iq5mMYybVPrDRDGj-IaAponEALw_wcB")

            settings.javaScriptEnabled=true
            //click on the torch then select the first function
            settings.safeBrowsingEnabled=true

            //then go to the manifest ((users permision...
        }

    }
    // going back to the previous web site
    @SuppressLint("SuspiciousIndentation")
    override fun onBackPressed() {
        if (mywebview.canGoBack())mywebview.goBack()else
            super.onBackPressed()
    }
}