package com.example.task7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task7.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, Fragment_1()).addToBackStack("Fragment_1").commit()
    }
}