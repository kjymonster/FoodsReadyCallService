package com.example.foodsreadycallservice

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setupBtn()

        var anim: Animation
        var start = false

        var clickCount = 0


        callBtn.setOnClickListener {

            popNumTxt.visibility = View.VISIBLE

            clickCount = clickCount + 1
            popNumTxt.text = "${clickCount}"

            val callNumList: MutableList<Int> = mutableListOf(clickCount)
            callNumList.add(clickCount)
            popNumTxt.text = "${callNumList[0]}"

           Handler().postDelayed({
                   popNumTxt.visibility = View.GONE
               }, 3000)

            mainNumTxt.text = popNumTxt.text


            anim = AlphaAnimation(0.0f, 1.0f) //투명도. 0.0~1.0
            anim.setDuration(1000)  //지속시간. (100) = 100 = 1초
            //anim.setStartOffset(20) //한번 애니메이션이 시작하기위해 대기하는 시간
            //anim.setRepeatMode(Animation.REVERSE) //반복
            anim.setRepeatCount(4) //몇번 반복할지

            if (mainNumTxt != null) {
                if (!start) {
                    start = true;
                    mainNumTxt.startAnimation(anim)
                    mainNumTxt.visibility = View.INVISIBLE

                    anim.setAnimationListener(object : AnimationListener {
                        override fun onAnimationRepeat(p0: Animation?) {}

                        override fun onAnimationEnd(animation: Animation) {

                            subNumTxt01.text = mainNumTxt.text
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


    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }


//    fun setupBtn() {
//        setupBtn.setOnClickListener {
//            ContextCompat.startActivity(Intent(this, SetupActivity::class.java))
//        }
}






