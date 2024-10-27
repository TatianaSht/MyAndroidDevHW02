package com.example.myandroiddevhw02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myandroiddevhw02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.post2.setTopText("Верхняя строчка, настроенная из кода")
        binding.post2.setBottomText("Нижняя строчка, настроенная из кода")
    }
}