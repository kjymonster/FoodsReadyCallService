package com.example.foodsreadycallservice.data

import android.os.Bundle
import android.view.View
import com.example.foodsreadycallservice.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class OnCallData : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {


    }

    override fun setValues() {

    }

    fun CalledNumber() {
        val calledNum = 0
        val callNum: MutableList<Int> = mutableListOf()
        callNum.add(0,1)
        callNum.add(1,2)

        popNumTxt.text = "${callNum[0]}"

    }
}