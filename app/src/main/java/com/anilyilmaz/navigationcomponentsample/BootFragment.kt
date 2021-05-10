package com.anilyilmaz.navigationcomponentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class BootFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_boot, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonHome = view.findViewById<Button>(R.id.boot_navigate_home_button)
        val buttonSettings = view.findViewById<Button>(R.id.boot_navigate_settings_button)

        buttonHome?.setOnClickListener { findNavController().navigate(R.id.action_boot_to_home) }
        buttonSettings?.setOnClickListener { findNavController().navigate(R.id.action_boot_to_settings) }
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(context,"Boot Fragment on stop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(context,"Boot Fragment on destroy", Toast.LENGTH_SHORT).show()
    }
}