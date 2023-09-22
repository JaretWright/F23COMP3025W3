package com.example.f23comp3025w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.f23comp3025w3.databinding.ActivityMainBinding

//public class MainActivity extends AppCompatActivity
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("Lifecycle","MainActivity.onCreate() called")
    }

    
}