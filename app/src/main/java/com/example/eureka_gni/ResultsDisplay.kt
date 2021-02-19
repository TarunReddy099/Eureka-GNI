package com.example.eureka_gni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore

class ResultsDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results_display)

        val name=findViewById<TextView>(R.id.name)
        val section=findViewById<TextView>(R.id.sec)
        val ml=findViewById<TextView>(R.id.ml_marks)
        val mad=findViewById<TextView>(R.id.mad_marks)
        val iss=findViewById<TextView>(R.id.is_marks)
        val ws=findViewById<TextView>(R.id.ws_marks)
        val madlab=findViewById<TextView>(R.id.madlab_marks)
        val ai=findViewById<TextView>(R.id.ai_marks)
        val total=findViewById<TextView>(R.id.total)


        var ii: Intent = getIntent()
        var docu : String = ii.getStringExtra("sid")

        var myDB1 = FirebaseFirestore.getInstance()

        val docRef2: DocumentReference =
            myDB1.collection("results").document(docu)
        docRef2.get().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val document = task.result
                if (document != null) {

                    var sname=document.getString("name").toString()
                    name.text = sname

                    var sec=document.getString("class").toString()
                    section.text=sec
                    var mlsub=document.getString("ml").toString()
                    ml.text=mlsub

                    var aisub=document.getString("ai").toString()
                    ai.text=aisub
                    var issub=document.getString("is").toString()
                    iss.text=issub
                    var madlabsub=document.getString("madlab").toString()
                    madlab.text=madlabsub
                    var wssub=document.getString("ws").toString()
                    ws.text=wssub
                    var madsub=document.getString("mad").toString()
                    mad.text=madsub
                    var finalgrade=document.getString("total").toString()
                    total.text=finalgrade














                }
            }
        }


    }
}