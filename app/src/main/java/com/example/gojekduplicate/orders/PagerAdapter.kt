package com.example.gojekduplicate.orders

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(val fragment: Fragment) : FragmentStateAdapter(fragment) {

    private val titles = listOf<String>("History", "Ongoing", "Scheduled")

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 ->{
                val historyFragment = HistoryFragment()
                return historyFragment
            }
            1 ->{
                val ongoingFragment = OngoingFragment()
                return ongoingFragment
            }
            2 ->{
                val scheduledFragment = ScheduledFragment()
                return scheduledFragment
            }
            else ->{
                val historyFragment = HistoryFragment()
                return historyFragment
            }
        }
    }
}