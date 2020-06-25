package com.example.eureka_gni.ui.slideshow

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.eureka_gni.*

class SlideshowFragment : Fragment() {



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
        val view: View = inflater!!.inflate(R.layout.fragment_slideshow, container, false)

        val b1=view!!.findViewById<Button>(R.id.r1)
        val b2=view!!.findViewById<Button>(R.id.r2)
        val b3=view!!.findViewById<Button>(R.id.r3)
        val b4=view!!.findViewById<Button>(R.id.r4)
        val b5=view!!.findViewById<Button>(R.id.r5)
        b1?.setOnClickListener {
            val iii = Intent(requireActivity().baseContext,Register1Screen::class.java)
            iii.putExtra("event","e1")
            requireActivity().startActivity(iii)

        }
        b2?.setOnClickListener {
            val iii = Intent(requireActivity().baseContext,Register1Screen::class.java)
            iii.putExtra("event","e2")
            requireActivity().startActivity(iii)

        }
        b3?.setOnClickListener {
            val iii = Intent(requireActivity().baseContext,Register1Screen::class.java)
            iii.putExtra("event","e3")
            requireActivity().startActivity(iii)

        }
        b4?.setOnClickListener {
            val iii = Intent(requireActivity().baseContext,Register1Screen::class.java)
            iii.putExtra("event","e4")
            requireActivity().startActivity(iii)

        }
        b5?.setOnClickListener {
            val iii = Intent(requireActivity().baseContext,Register1Screen::class.java)
            iii.putExtra("event","e5")
            requireActivity().startActivity(iii)

        }
        return view
        return root

    }
}
