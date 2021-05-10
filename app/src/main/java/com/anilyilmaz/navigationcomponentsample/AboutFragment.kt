package com.anilyilmaz.navigationcomponentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class AboutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button?>(R.id.about_navigate_to_settings_button)
        button?.setOnClickListener { findNavController().navigate(R.id.action_about_to_settings) }
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(context,"About Fragment on stop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(context,"About Fragment on destroy", Toast.LENGTH_SHORT).show()
    }
}