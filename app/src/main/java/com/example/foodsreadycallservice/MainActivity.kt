package com.example.foodsreadycallservice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.foodsreadycallservice.fragments.subNumFragment01
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBtn()

        //Popup액티비티에서 받아온 숫자를 mainNumTxt에 띄워줌.
        val receivedNum = intent.getIntExtra("popupNum", -1)
        mainNumTxt.text = "${receivedNum}"


        //mainNumTxt가 점멸 후 지워짐.
//        mainNumTxt.text = null

        //mainNumTxt가 점멸 후 사라지면 receivedNum을 Int로 변경해서 subNumFragment01 프래그먼트로 보냄
       // val changedMainNum = receivedNum.toString().toInt()
        val changedMainNum = 350

      if(mainNumTxt == null) {
//          val myIntent = Intent(this, subNumFragment01::class.java)
//          myIntent.putExtra("main_num", changedMainNum)
//          startActivity(myIntent)

          val fragment: Fragment = subNumFragment01() // Fragment 생성
          val bundle = Bundle() // 파라미터는 전달할 데이터 개수
          bundle.putInt("main_num", changedMainNum) // key , value
          fragment.setArguments(bundle)

          }



    }



    fun setupBtn() {
        setupBtn.setOnClickListener {
            startActivity(Intent(this,SetupActivity::class.java))
        }
    }
}