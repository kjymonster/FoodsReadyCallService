package com.example.foodsreadycallservice.fragments

import android.R.attr.defaultValue
import android.R.attr.key
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.foodsreadycallservice.R
import kotlinx.android.synthetic.main.activity_sub_num_fragment01.*


class subNumFragment01 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        //Main액티비티에서 받아온 값 출력
//        val receivedNum = getArguments()!!.getInt("main_num", -1) // 전달한 key 값
//        subNumTxt01.text = "${receivedNum}"

        return inflater.inflate(R.layout.activity_sub_num_fragment01, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        val receivedNum = .intent.getIntExtra("main_num", -1)
//        subNumTxt01.text = "${receivedNum}"

        val bundle = this.arguments
        if (bundle != null) {
            val receivedNum= bundle.getInt("main_num", -1)
            subNumTxt01.text = "${receivedNum}"
        }


    }
}