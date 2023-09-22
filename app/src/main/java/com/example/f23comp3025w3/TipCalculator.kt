package com.example.f23comp3025w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.f23comp3025w3.databinding.ActivityTipCalculatorBinding

class TipCalculator : AppCompatActivity() {
    private lateinit var binding : ActivityTipCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("Lifecycle","TipCalculator.onCreate() called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle","TipCalculator.onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle","TipCalculator.onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle","TipCalculator.onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle","TipCalculator.onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle","TipCalculator.onDestroy() called")
    }
}