package com.example.eureka_gni.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.eureka_gni.*


class HomeFragment : Fragment() {


    var viewPager: ViewPager? = null
    var adapter: CustomSwipeAdapter? = null
    lateinit var detail: String


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val events = view.findViewById<CardView>(R.id.events)
        val dev_mail = view.findViewById<TextView>(R.id.devmail)
        val clubs = view.findViewById<CardView>(R.id.clubs)
        val results = view.findViewById<CardView>(R.id.results)
        val visitGni = view.findViewById<CardView>(R.id.visitGni)
        val
                viewPager = view.findViewById<View>(R.id.view_pager) as ViewPager
        adapter = CustomSwipeAdapter(this.activity)
        viewPager!!.adapter = adapter


        events.setOnClickListener {
            startActivity(Intent(requireActivity().baseContext, EventActivity::class.java))
        }
        clubs.setOnClickListener {
            startActivity(Intent(requireActivity().baseContext, ClubJoiningActivity::class.java))
        }

        results.setOnClickListener {
            startActivity(Intent(requireActivity().baseContext, ResultsHomeActivity::class.java))
        }
        visitGni.setOnClickListener {
            val iii = Intent(requireActivity().baseContext, Register1Screen::class.java)
            iii.putExtra("event", "clgsite")
            requireActivity().startActivity(iii)
        }



        dev_mail?.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("eurekaGni@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Subject text here...")
            intent.putExtra(Intent.EXTRA_TEXT, "Body of the content here...")
            intent.putExtra(Intent.EXTRA_CC, "mailcc@gmail.com")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }
        return view
    }


}



