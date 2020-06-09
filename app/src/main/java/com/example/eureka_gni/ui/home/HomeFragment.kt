package com.example.eureka_gni.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.eureka_gni.R
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore

class HomeFragment : Fragment() {



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val view: View = inflater!!.inflate(R.layout.fragment_home, container, false)
 val t1=view.findViewById<TextView>(R.id.title1)
        val st1 =view.findViewById<TextView>(R.id.supportext1)

        val t2=view.findViewById<TextView>(R.id.title2)
        val st2 =view.findViewById<TextView>(R.id.supporting_text2)

        val t3=view.findViewById<TextView>(R.id.title3)
        val st3 =view.findViewById<TextView>(R.id.supporting_text3)

        val t4=view.findViewById<TextView>(R.id.title4)
        val st4 =view.findViewById<TextView>(R.id.supporting_text4)

        val t5=view.findViewById<TextView>(R.id.title5)
        val st5 =view.findViewById<TextView>(R.id.supporting_text5)

        val t6=view.findViewById<TextView>(R.id.title6)
        val st6 =view.findViewById<TextView>(R.id.supporting_text6)

        var myDB = FirebaseFirestore.getInstance()


        val docRef1: DocumentReference =
            myDB.collection("homepage").document("notif1")
        docRef1.get().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val document = task.result
                if (document != null) {
                    val titleText: String? = document.getString("title")
                    val supportText: String? = document.getString("support_title")


                    t1.text =titleText
                    st1.text=supportText

                } else {
                    Log.d("LOGGER", "No such document")
                }
            } else {
                Log.d("LOGGER", "get failed with ", task.exception)
            }
        }
        val docRef2: DocumentReference =
            myDB.collection("homepage").document("notif2")
        docRef2.get().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val document = task.result
                if (document != null) {
                    val titleText: String? = document.getString("title1")
                    val supportText: String? = document.getString("support_title1")


                    t2.text =titleText
                    st2.text=supportText

                } else {
                    Log.d("LOGGER", "No such document")
                }
            } else {
                Log.d("LOGGER", "get failed with ", task.exception)
            }
        }

        val docRef3: DocumentReference =
            myDB.collection("homepage").document("notif3")
        docRef3.get().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val document = task.result
                if (document != null) {
                    val titleText: String? = document.getString("title2")
                    val supportText: String? = document.getString("support_title2")


                    t3.text =titleText
                    st3.text=supportText

                } else {
                    Log.d("LOGGER", "No such document")
                }
            } else {
                Log.d("LOGGER", "get failed with ", task.exception)
            }
        }
        val docRef4: DocumentReference =
            myDB.collection("homepage").document("notif4")
        docRef4.get().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val document = task.result
                if (document != null) {
                    val titleText: String? = document.getString("title3")
                    val supportText: String? = document.getString("support_title3")


                    t4.text =titleText
                    st4.text=supportText

                } else {
                    Log.d("LOGGER", "No such document")
                }
            } else {
                Log.d("LOGGER", "get failed with ", task.exception)
            }
        }
        val docRef5: DocumentReference =
            myDB.collection("homepage").document("notif5")
        docRef5.get().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val document = task.result
                if (document != null) {
                    val titleText: String? = document.getString("title4")
                    val supportText: String? = document.getString("support_title4")


                    t5.text =titleText
                    st5.text=supportText

                } else {
                    Log.d("LOGGER", "No such document")
                }
            } else {
                Log.d("LOGGER", "get failed with ", task.exception)
            }
        }
        val docRef6: DocumentReference =
            myDB.collection("homepage").document("notif6")
        docRef6.get().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val document = task.result
                if (document != null) {
                    val titleText: String? = document.getString("title5")
                    val supportText: String? = document.getString("support_title5")


                    t6.text =titleText
                    st6.text=supportText

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
