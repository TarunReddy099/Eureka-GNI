package com.example.eureka_gni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ClubJoiningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_club_joining)

        val c1 = findViewById<Button>(R.id.joinclicks)
        val c2 = findViewById<Button>(R.id.jointechmatz)
        val c3 = findViewById<Button>(R.id.joinstrretcause)
        val c4 = findViewById<Button>(R.id.joinyoustav)



        c1.setOnClickListener {
            val iii = Intent(this, ClubJoiningForms::class.java)
            iii.putExtra("clubtype", "clicks")
            startActivity(iii)
        }
        c2.setOnClickListener {
            val iii = Intent(this, ClubJoiningForms::class.java)
            iii.putExtra("clubtype", "techmatz")
            startActivity(iii)
        }

        c3.setOnClickListener {
            val iii = Intent(this, ClubJoiningForms::class.java)
            iii.putExtra("clubtype", "streets")
            startActivity(iii)
        }

        c4.setOnClickListener {
            val iii = Intent(this, ClubJoiningForms::class.java)
            iii.putExtra("clubtype", "youstav")
            startActivity(iii)
        }


    }
}