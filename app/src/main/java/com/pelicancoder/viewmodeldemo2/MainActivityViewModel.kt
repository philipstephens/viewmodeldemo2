package com.pelicancoder.viewmodeldemo2

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var sum = 0

    fun addNumber(x: Int) {
        sum += x
    }

    fun getSum(): Int {
        return sum
    }
}