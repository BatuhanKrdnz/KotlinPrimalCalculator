package com.batuhankaradeniz.kotlinprimalcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.batuhankaradeniz.kotlinprimalcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var num1 : Int? = null
    var num2 : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun mySum(view: View) {
        num1 = binding.editTextNumber.text.toString().toIntOrNull()
        num2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if(num1 == null || num2 == null) {
            binding.resultText.text = "ERROR!!"
        } else {
            result = num1!! + num2!!
            binding.resultText.text = "Result: $result"
        }

    }

    fun mySub(view: View) {
        num1 = binding.editTextNumber.text.toString().toIntOrNull()
        num2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if(num1 == null || num2 == null) {
            binding.resultText.text = "ERROR!!"
        } else {
            result = num1!! - num2!!
            binding.resultText.text = "Result: $result"
        }
    }

    fun myMulti(view: View) {
        num1 = binding.editTextNumber.text.toString().toIntOrNull()
        num2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if(num1 == null || num2 == null) {
            binding.resultText.text = "ERROR!!"
        } else {
            result = num1!! * num2!!
            binding.resultText.text = "Result: $result"
        }
    }

    fun myDiv(view: View) {
        num1 = binding.editTextNumber.text.toString().toIntOrNull()
        num2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if(num1 == null || num2 == null) {
            binding.resultText.text = "ERROR!!"
        } else {
            result = num1!! / num2!!
            binding.resultText.text = "Result: $result"
        }
    }
}