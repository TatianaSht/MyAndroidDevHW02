package com.example.myandroiddevhw02

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.myandroiddevhw02.databinding.CustomViewPostBinding

class CustomView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttributeSet: Int = 0,
) : LinearLayout(context, attributeSet, defStyleAttributeSet) {
    private val binding = CustomViewPostBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }

    fun setTopText(text: String) {
        binding.topLine.text = text
    }

    fun setBottomText(text: String) {
        binding.bottomLine .text = text
    }
}