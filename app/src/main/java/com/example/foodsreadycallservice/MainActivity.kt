package com.example.foodsreadycallservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBtn.setOnClickListener {
            startActivity(Intent(this,SetupActivity::class.java))
        }

        mainNumTxt.setOnClickListener {
            startActivity(Intent(this,PopupActivity::class.java))
        }
    }
}