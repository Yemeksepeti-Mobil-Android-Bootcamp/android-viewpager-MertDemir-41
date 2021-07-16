package com.example.AndroidBootcamphw2.fragments.onboard

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.AndroidBootcamphw2.R
import com.example.AndroidBootcamphw2.base.BaseFragment

class OnboardFragment3 : BaseFragment() {

    lateinit var buttonOnboard3: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_onboard3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }

    private fun initViews(view: View) {
        buttonOnboard3 = view.findViewById(R.id.button_Onboard3)
        buttonOnboard3.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({
                findNavController().navigate(R.id.action_mainOnboardFragment_to_homepageFragment)
            }, 1000)
        }
    }

}