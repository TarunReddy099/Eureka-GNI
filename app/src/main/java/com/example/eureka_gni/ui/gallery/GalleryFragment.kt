package com.example.eureka_gni.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.eureka_gni.ClubJoiningForms
import com.example.eureka_gni.R

class GalleryFragment : Fragment() {



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val view: View = inflater!!.inflate(R.layout.fragment_gallery, container, false)

        val c1=view.findViewById<Button>(R.id.joinclicks)
        val c2=view.findViewById<Button>(R.id.jointechmatz)
        val c3=view.findViewById<Button>(R.id.joinstrretcause)
        val c4=view.findViewById<Button>(R.id.joinyoustav)



c1?.setOnClickListener {
    val iii = Intent(requireActivity().baseContext, ClubJoiningForms::class.java)
    iii.putExtra("clubtype","clicks")
    requireActivity().startActivity(iii)
}
        c2?.setOnClickListener {
            val iii = Intent(requireActivity().baseContext, ClubJoiningForms::class.java)
            iii.putExtra("clubtype","techmatz")
            requireActivity().startActivity(iii)
        }

        c3?.setOnClickListener {
            val iii = Intent(requireActivity().baseContext, ClubJoiningForms::class.java)
            iii.putExtra("clubtype","streets")
            requireActivity().startActivity(iii)
        }

        c4?.setOnClickListener {
            val iii = Intent(requireActivity().baseContext, ClubJoiningForms::class.java)
            iii.putExtra("clubtype","youstav")
            requireActivity().startActivity(iii)
        }












        return view

        return root

    }
}
