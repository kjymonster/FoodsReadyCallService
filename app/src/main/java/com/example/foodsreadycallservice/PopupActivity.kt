package com.example.foodsreadycallservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_popup.*

class PopupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup)

        var popupNum = 200
        popupNumTxt.text = "${popupNum}"

        if(popupNumTxt != null) {

            val myIntent = Intent(this, MainActivity::class.java)
            myIntent.putExtra("popupNum", popupNum)
            startActivity(myIntent)
        }else {
            return
        }




     }
}