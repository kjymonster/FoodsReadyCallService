package com.example.foodsreadycallservice

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getSystemService
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setupBtn()



        //Popup액티비티에서 받아온 숫자를 mainNumTxt에 띄워줌.
        val receivedNum = intent.getIntExtra("popupNum", -1)
        mainNumTxt.text = "${receivedNum}"

        var anim: Animation
        var start = false

        anim = AlphaAnimation(0.0f, 1.0f) //투명도. 0.0~1.0
        anim.setDuration(1000)  //지속시간. (100) = 100 = 1초
        //anim.setStartOffset(20) //한번 애니메이션이 시작하기위해 대기하는 시간
        //anim.setRepeatMode(Animation.REVERSE) //반복
        anim.setRepeatCount(4) //몇번 반복할지

        if (mainNumTxt != null) {
//          val myIntent = Intent(this, subNumFragment01::class.java)
//          myIntent.putExtra("main_num", changedMainNum)
//          startActivity(myIntent)

//          val fragment: Fragment = subNumFragment01() // Fragment 생성
//          val bundle = Bundle() // 파라미터는 전달할 데이터 개수
//          bundle.putInt("main_num", changedMainNum) // key , value
//          fragment.setArguments(bundle)

            if (!start) {
                start = true;
                mainNumTxt.startAnimation(anim)
                mainNumTxt.visibility = View.INVISIBLE

                anim.setAnimationListener(object : AnimationListener {
                    override fun onAnimationRepeat(p0: Animation?) {}

                    override fun onAnimationEnd(animation: Animation) {

                        subNumTxt04.text = "${receivedNum}"
                    }

                    override fun onAnimationStart(p0: Animation?) {}
                })
            } else {
                start = false;
                mainNumTxt.clearAnimation();
            }


//            Handler().postDelayed(Runnable {
//                //여기에 딜레이 후 시작할 작업들을 입력
//                subNumTxt04.text = "${receivedNum}"
//            }, 5500) // 5.5초 정도 딜레이를 준 후 시작

        }


    }


//    fun setupBtn() {
//        setupBtn.setOnClickListener {
//            ContextCompat.startActivity(Intent(this, SetupActivity::class.java))
//        }
}






