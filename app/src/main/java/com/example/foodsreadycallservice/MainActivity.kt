package com.example.foodsreadycallservice

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.View.INVISIBLE
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.widget.Switch
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : BaseActivity() {

    private lateinit var numQueue : Queue<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setupBtn()

        var anim: Animation
        var start = false
        var clickCount = 0
        var i = 0

//        var numList = arrayOfNulls<Int>(13)


        callBtn.setOnClickListener {
            popNumTxt.visibility = View.VISIBLE
            clickCount = clickCount + 1

//            for (i in 0..12) {
//                numList[i] = clickCount
//                if (i > 12) {
//                    i == 0
//                    continue
//                }
//            }

//            when(clickCount){
//                1 -> numList[0] = clickCount
//                2 -> numList[1] = clickCount
//                3 -> numList[2] = clickCount
//                4 -> numList[3] = clickCount
//
//            }

            numQueue = LinkedList()

            numQueue.offer(clickCount)

           popNumTxt.text = "${numQueue.poll()}"

            Handler().postDelayed({
                popNumTxt.visibility = View.GONE
            }, 3000)



            mainNumTxt.text = popNumTxt.text

            anim = AlphaAnimation(0.0f, 1.0f) //투명도. 0.0~1.0
            anim.setDuration(1500)  //지속시간. (100) = 100 = 1초
//            anim.setStartOffset(10) //한번 애니메이션이 시작하기위해 대기하는 시간
//            anim.setRepeatMode(Animation.REVERSE) //반복
            anim.setRepeatCount(5) //몇번 반복할지

            if (mainNumTxt.text != null) {
                if (!start) {
//                    start = true
                    mainNumTxt.startAnimation(anim)
                    mainNumTxt.visibility = View.INVISIBLE


                } else {
                    start = false;
                    mainNumTxt.clearAnimation();
                }
                anim.setAnimationListener(object : AnimationListener {
                    override fun onAnimationRepeat(p0: Animation?) {}

                    override fun onAnimationEnd(animation: Animation) {
                        subNumTxt01.text = mainNumTxt.text
                        subNumTxt02.text = subNumTxt02.text
                        subNumTxt03.text = "${numQueue.poll()}"
                    }

                    override fun onAnimationStart(p0: Animation?) {

                    }
                })
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






