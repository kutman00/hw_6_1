package com.geektech.hw_6_1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var mCounter = 0

    val counter = MutableLiveData<Int>()
    private val list = arrayListOf<String>()
    val historyClick = MutableLiveData<ArrayList<String>>()

    fun onIncrementClick() {
        mCounter++
        list.add("+")
        historyClick.value = list
        counter.value = mCounter
        println(historyClick.toString())
    }

    fun onDecrementClick() {
        mCounter--
        list.add("-")
        historyClick.value = list
        println(historyClick.value.toString())
        counter.value = mCounter
    }
}