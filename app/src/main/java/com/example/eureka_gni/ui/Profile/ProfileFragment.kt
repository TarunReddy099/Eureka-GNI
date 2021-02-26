package com.example.eureka_gni.ui.Profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.eureka_gni.ClubJoiningForms
import com.example.eureka_gni.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.squareup.picasso.Picasso


class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_profile, container, false)
        val view: View = inflater!!.inflate(R.layout.fragment_profile, container, false)

        val name = view.findViewById<TextView>(R.id.studName)
        val rollno = view.findViewById<TextView>(R.id.roll_no)
        val branch = view.findViewById<TextView>(R.id.branchName)
        val year = view.findViewById<TextView>(R.id.grad_year)
        val stdiimg = view.findViewById<ImageView>(R.id.studentImage)
        val mFirestore: FirebaseFirestore = FirebaseFirestore.getInstance()
        val user = FirebaseAuth.getInstance().currentUser
        val email: String = user?.email.toString()

        val docRef: DocumentReference =
            mFirestore.collection("users")
                .document(email)
        docRef.get().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val document = task.result
                if (document != null) {

                    val sname: String = document.getString("name").toString()
                    val sroll: String = document.getString("roll").toString()
                    val syear: String = document.getString("year").toString()
                    val sbranch: String = document.getString("branch").toString()
                    val surl: String = document.getString("img").toString()


                    name.text = sname
                    rollno.text = sroll
                    branch.text = sbranch
                    year.text = syear

                    Picasso.get().load(surl).into(stdiimg);


                }
            }
        }
        return view

        return root

    }
}
