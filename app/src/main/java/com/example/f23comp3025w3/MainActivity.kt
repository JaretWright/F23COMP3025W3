package com.example.f23comp3025w3

import android.content.Intent
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

        binding.button.setOnClickListener {
            startActivity(Intent(this, TipCalculator::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle","MainActivity.onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle","MainActivity.onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle","MainActivity.onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle","MainActivity.onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle","MainActivity.onDestroy() called")
    }
}