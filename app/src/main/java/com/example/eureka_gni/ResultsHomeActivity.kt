package com.example.eureka_gni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ResultsHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results_home)
        val sid=findViewById<EditText>(R.id.id)
        val submit=findViewById<Button>(R.id.submit)

        submit.setOnClickListener {
            val intent = Intent(this,ResultsDisplay::class.java)
            intent.putExtra("sid",sid.text.toString())
            startActivity(intent)
        }
    }
}