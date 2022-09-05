package com.example.gojekduplicate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.gojekduplicate.orders.PagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class OrdersFragment : Fragment() {

    lateinit var pageAdapter: PagerAdapter
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager2
    private val titles = listOf<String>("History", "Ongoing", "Scheduled")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_orders, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewPager= view.findViewById(R.id.view_pager)
        tabLayout = view.findViewById(R.id.tab_layout)
        pageAdapter = PagerAdapter(this)
        viewPager.adapter = pageAdapter
        TabLayoutMediator(tabLayout, viewPager){
            tab, position -> tab.text = titles[position]
        }.attach()
    }
}