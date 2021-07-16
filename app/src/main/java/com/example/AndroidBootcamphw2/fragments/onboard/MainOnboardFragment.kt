package com.example.AndroidBootcamphw2.fragments.onboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.AndroidBootcamphw2.R
import com.example.AndroidBootcamphw2.util.ViewPagerAdapter
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator

class MainOnboardFragment: Fragment() {

    lateinit var viewPager: ViewPager2
    lateinit var springDotsIndicator: SpringDotsIndicator

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_onboard_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
        initViewPager()
    }

    private fun initViews(view: View) {
        viewPager = view.findViewById(R.id.viewPager)
        viewPager.adapter = ViewPagerAdapter(activity as AppCompatActivity)
        springDotsIndicator = view.findViewById<SpringDotsIndicator>(R.id.spring_dots_indicator)
    }

    private fun initViewPager() {
        val adapter = ViewPagerAdapter(requireActivity())
        viewPager.adapter = adapter
        springDotsIndicator.setViewPager2(viewPager)


    }

}