package com.example.fragmentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.fragmentsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val homeFragment = HomeFragment()

        val fragmentManager:FragmentManager = supportFragmentManager

        val fragmentTransaction:FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.activity_main,homeFragment).commit()
    }
}