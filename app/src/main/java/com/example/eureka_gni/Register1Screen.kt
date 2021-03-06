package com.example.eureka_gni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore

class Register1Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register1_screen)
        var myDB = FirebaseFirestore.getInstance()


        val docRef: DocumentReference =
            myDB.collection("LiveEvents").document("Livelinks")
        docRef.get().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val document = task.result
                if (document != null) {
                    var iii: Intent
                    iii = getIntent()
                    var info: String = iii.getStringExtra("event")
                    val register: String? = document.getString(info)

                    val myWebView: WebView = findViewById(R.id.webviewb)
                    val webSettings: WebSettings = myWebView.getSettings()
                    webSettings.javaScriptEnabled = true
                    myWebView.setWebViewClient(WebViewClient())
                    myWebView.loadUrl(register)


                } else {
                    Log.d("LOGGER", "No such document")
                }
            } else {
                Log.d("LOGGER", "get failed with ", task.exception)
            }
        }
    }
}