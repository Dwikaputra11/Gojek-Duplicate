package com.example.gojekduplicate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     supportFragmentManager.beginTransaction().apply {
         replace(R.id.fragmentContainerGojek,ChatFragment())
         commit()
     }
        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menuHome ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerGojek,HomeFragment()).commit()
                    return@setOnNavigationItemSelectedListener true
                } R.id.menuPromos ->{
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerGojek,PromosFragment()).commit()
                return@setOnNavigationItemSelectedListener true
                } R.id.menuOrders ->{
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerGojek,OrdersFragment()).commit()
                return@setOnNavigationItemSelectedListener true
                } R.id.menuChat ->{
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerGojek,ChatFragment()).commit()
                return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }
}