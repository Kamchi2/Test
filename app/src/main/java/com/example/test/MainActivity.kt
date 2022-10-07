package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val math = Math()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            calculatePlusBtn.setOnClickListener {
                resultTv.text = math.add(firstNumberEt.text.toString(), secondNumberEt.text.toString())
            }
            calculateDevideBtn.setOnClickListener {
                resultTv.text = math.devide(firstNumberEt.text.toString(), secondNumberEt.text.toString())
            }
        }
    }
}