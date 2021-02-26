package com.example.eureka_gni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EventActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)

        val b1 = findViewById<Button>(R.id.r1)
        val b2 = findViewById<Button>(R.id.r2)
        val b3 = findViewById<Button>(R.id.r3)
        b1.setOnClickListener {
            val iii = Intent(this, Register1Screen::class.java)
            iii.putExtra("event", "e1")
            startActivity(iii)

        }
        b2.setOnClickListener {
            val iii = Intent(this, Register1Screen::class.java)
            iii.putExtra("event", "e2")
            startActivity(iii)

        }
        b3.setOnClickListener {
            val iii = Intent(this, Register1Screen::class.java)
            iii.putExtra("event", "e3")
            startActivity(iii)

        }
    }
}