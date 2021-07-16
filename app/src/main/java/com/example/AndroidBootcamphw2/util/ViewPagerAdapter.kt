package com.example.AndroidBootcamphw2.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.AndroidBootcamphw2.fragments.onboard.OnboardFragment1
import com.example.AndroidBootcamphw2.fragments.onboard.OnboardFragment2
import com.example.AndroidBootcamphw2.fragments.onboard.OnboardFragment3



    class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
        override fun getItemCount(): Int = 3

        override fun createFragment(position: Int): Fragment {
            return when(position){
                0 -> OnboardFragment1()
                1 -> OnboardFragment2()
                2 -> OnboardFragment3()
                else -> OnboardFragment3()
            }
        }

}