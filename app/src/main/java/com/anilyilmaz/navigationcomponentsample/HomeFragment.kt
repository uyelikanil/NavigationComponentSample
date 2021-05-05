package com.anilyilmaz.navigationcomponentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/**
 * Fragment used to show how to navigate to another destination
 */
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
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(context, "Home Fragment on start", Toast.LENGTH_SHORT)
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(context, "Home Fragment on stop", Toast.LENGTH_SHORT)
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(context, "Home Fragment on destroy", Toast.LENGTH_SHORT)
    }
}