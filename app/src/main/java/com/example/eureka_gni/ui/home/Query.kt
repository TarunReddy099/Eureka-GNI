package com.example.eureka_gni.ui.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import com.example.eureka_gni.R
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.fragment_query.*

/**
 * A simple [Fragment] subclass.
 */
class Query : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_query, container, false)
        val view: View = inflater!!.inflate(R.layout.fragment_query, container, false)

        val submit=view!!.findViewById<Button>(R.id.query_btn)
        val complaint=view!!.findViewById<EditText>(R.id.editTextTextMultiLine)



        submit.setOnClickListener() {
            var section_details = spinner.selectedItem.toString()
            val mFirestore: FirebaseFirestore = FirebaseFirestore.getInstance()


            val usermap = HashMap<String, Any>()
            usermap.put("type of query", section_details)
            usermap.put("nominee age", complaint.text.toString())



            mFirestore.collection("querys").add(usermap).addOnSuccessListener {
                Toast.makeText(requireActivity().baseContext,"sent",Toast.LENGTH_SHORT).show()

            }.addOnFailureListener {
                Toast.makeText(requireActivity().baseContext, "error please try later", Toast.LENGTH_LONG).show()
            }
        }

        return view
        return root
    }

}
