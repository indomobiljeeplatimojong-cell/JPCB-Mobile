package com.jpcb.mobile

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    private val appUrl =
        "https://script.google.com/macros/s/AKfycbwvJlMz3-5hrAFj20HZaiqaucZaEMbmUerEjue-LjzD83r_ZfoNTNfzC1ZLEeVG2Hg8Eg/exec?action=mobile"

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        webView = WebView(this)
        setContentView(webView)

        webView.settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            databaseEnabled = true
            loadsImagesAutomatically = true
            mixedContentMode = WebSettings.MIXED_CONTENT_NEVER_ALLOW
            builtInZoomControls = false
            displayZoomControls = false
            userAgentString = "$userAgentString JPCBMobile/1.0"
        }

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                request: WebResourceRequest
            ): Boolean {
                return false
            }
        }

        webView.webChromeClient = WebChromeClient()
        webView.loadUrl(appUrl)

        onBackPressedDispatcher.addCallback(
            this,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    if (webView.canGoBack()) {
                        webView.goBack()
                    } else {
                        finish()
                    }
                }
            }
        )
    }

    override fun onDestroy() {
        webView.destroy()
        super.onDestroy()
    }
}
