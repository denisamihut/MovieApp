package com.example.movieapp.ui.tab_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movieapp.databinding.ActivityTabbedMainBinding

class TabbedMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTabbedMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabbedMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}