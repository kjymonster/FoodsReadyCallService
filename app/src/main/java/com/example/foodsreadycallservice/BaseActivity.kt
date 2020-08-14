package com.example.foodsreadycallservice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity()  {

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

}