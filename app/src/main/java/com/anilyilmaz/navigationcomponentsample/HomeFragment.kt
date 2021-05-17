package com.anilyilmaz.navigationcomponentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonBoot = view.findViewById<Button>(R.id.navigate_boot_button)
        val buttonDetail = view.findViewById<Button>(R.id.navigate_detail_button)
        val buttonSettings = view.findViewById<Button>(R.id.navigate_settings_button)

        buttonBoot?.setOnClickListener { findNavController().navigate(R.id.bootFragment) }
        buttonDetail?.setOnClickListener { findNavController().navigate(R.id.detailFragment) }
        buttonSettings?.setOnClickListener { findNavController().navigate(R.id.settingsGraph) }
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(context, "Home Fragment on start", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(context, "Home Fragment on stop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(context, "Home Fragment on destroy", Toast.LENGTH_SHORT).show()
    }
}