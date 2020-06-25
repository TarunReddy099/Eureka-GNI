package com.example.eureka_gni.ui.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.eureka_gni.R
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore

/**
 * A simple [Fragment] subclass.
 */
class UpcomingEvents : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_upcoming_events, container, false)
        val view: View = inflater!!.inflate(R.layout.fragment_upcoming_events, container, false)
        val t1=view.findViewById<TextView>(R.id.uptitle1)
        val st1 =view.findViewById<TextView>(R.id.upsupportext1)

        val t2=view.findViewById<TextView>(R.id.uptitle2)
        val st2 =view.findViewById<TextView>(R.id.upsupporting_text2)

        val t3=view.findViewById<TextView>(R.id.uptitle3)
        val st3 =view.findViewById<TextView>(R.id.upsupporting_text3)

        val t4=view.findViewById<TextView>(R.id.uptitle4)
        val st4 =view.findViewById<TextView>(R.id.upsupporting_text4)

        val t5=view.findViewById<TextView>(R.id.uptitle5)
        val st5 =view.findViewById<TextView>(R.id.upsupporting_text5)

        val t6=view.findViewById<TextView>(R.id.uptitle6)
        val st6 =view.findViewById<TextView>(R.id.upsupporting_text6)

        var myDB = FirebaseFirestore.getInstance()

        val docRef: DocumentReference =
            myDB.collection("upcoming events ").document("eventslist")
        docRef.get().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val document = task.result
                if (document != null) {
                    val titleText1: String? = document.getString("event1")
                    val supportText1: String? = document.getString("event1details")
                    t1.text =titleText1
                    st1.text=supportText1


                    val titleText2: String? = document.getString("event2")
                    val supportText2: String? = document.getString("event2details")
                    t2.text =titleText2
                    st2.text=supportText2


                    val titleText3: String? = document.getString("event3")
                    val supportText3: String? = document.getString("event3details")
                    t3.text =titleText3
                    st3.text=supportText3

                    val titleText4: String? = document.getString("event4")
                    val supportText4: String? = document.getString("event4details")
                    t4.text =titleText4
                    st4.text=supportText4


                    val titleText5: String? = document.getString("event5")
                    val supportText5: String? = document.getString("event5details")
                    t5.text =titleText5
                    st5.text=supportText5

                    val titleText6: String? = document.getString("event6")
                    val supportText6: String? = document.getString("event6details")
                    t6.text =titleText6
                    st6.text=supportText6



                } else {
                    Log.d("LOGGER", "No such document")
                }
            } else {
                Log.d("LOGGER", "get failed with ", task.exception)
            }
        }



        return view
        return root
    }

}
