package com.example.f23comp3025w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import androidx.core.widget.addTextChangedListener
import com.example.f23comp3025w3.databinding.ActivityTipCalculatorBinding
import java.text.NumberFormat

class TipCalculator : AppCompatActivity() {
    private lateinit var binding : ActivityTipCalculatorBinding
    private var initalMealCost : Double = 0.0
    private var tipPercent = 15

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("Lifecycle","TipCalculator.onCreate() called")

        binding.mealPreTipAmountEditText!!.addTextChangedListener {
            if (!it.isNullOrBlank())
                initalMealCost = it.toString().toDouble()
            else
                initalMealCost=0.0

            calculateTip()
        }

        binding.seekBar!!.setOnSeekBarChangeListener( object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, newValue: Int, p2: Boolean) {
                tipPercent = newValue
                calculateTip()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })
    }

    private fun calculateTip()
    {
        var tip = initalMealCost*tipPercent / 100
        binding.tipPercentTextView!!.text = "${tipPercent}"

        val currencyFormat = NumberFormat.getCurrencyInstance()
        binding.totalTipAmountTextView!!.text = currencyFormat.format(tip)
        binding.totalMealCostTextView!!.text = currencyFormat.format(tip+initalMealCost)
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