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
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*


class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setupBtn()

        var anim: Animation
        var start = false
        var clickCount = 0
        var sum = 0
        var i = 0

        val numList = arrayOfNulls<Int>(1000)

        for (i in 0..999) {
            sum = i + 1
            numList[i] = sum
            if (i > 999) {
                break

            }
        }


//        val numQueue: Queue<Int> = LinkedList<Int>()
//        numQueue.add(1)
//        numQueue.add(2)
//        numQueue.add(3)
//        numQueue.add(4)
//        numQueue.add(5)


        callBtn.setOnClickListener {
            popNumTxt.visibility = View.VISIBLE
            clickCount = clickCount + 1

//            for (i in 0..12) {
//                numList[i] = j
////            if (i > 12) {
////                i == 0
////            }
//            }
//            numList[0] = clickCount
//            popNumTxt.text = "${numList[0]}"

//            numList[1] = numList[0]


//            for (i in 0..12) {
//                numList[i] = clickCount
//                if (i > 12) {
//                    i == 0
//                    continue
//                }
//            }

            when (clickCount) {
                1 -> {
                    popNumTxt.text = "${numList[clickCount-1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = mainNumTxt.text
                }
                2 -> {
                    popNumTxt.text = "${numList[clickCount-1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = mainNumTxt.text
                    subNumTxt02.text = "${numList[clickCount-2]}"
                }

                3 -> {
                    popNumTxt.text = "${numList[clickCount-1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = mainNumTxt.text
                    subNumTxt02.text = "${numList[clickCount-2]}"
                    subNumTxt03.text = "${numList[clickCount-3]}"
                }

                4 -> {
                    popNumTxt.text = "${numList[clickCount-1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = mainNumTxt.text
                    subNumTxt02.text = "${numList[clickCount-2]}"
                    subNumTxt03.text = "${numList[clickCount-3]}"
                    subNumTxt04.text = "${numList[clickCount-4]}"
                }

                5 -> {
                    popNumTxt.text = "${numList[clickCount-1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = mainNumTxt.text
                    subNumTxt02.text = "${numList[clickCount-2]}"
                    subNumTxt03.text = "${numList[clickCount-3]}"
                    subNumTxt04.text = "${numList[clickCount-4]}"
                    subNumTxt05.text = "${numList[clickCount-5]}"
                }

                6 -> {
                    popNumTxt.text = "${numList[clickCount-1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = mainNumTxt.text
                    subNumTxt02.text = "${numList[clickCount-2]}"
                    subNumTxt03.text = "${numList[clickCount-3]}"
                    subNumTxt04.text = "${numList[clickCount-4]}"
                    subNumTxt05.text = "${numList[clickCount-5]}"
                    subNumTxt06.text = "${numList[clickCount-6]}"
                }

                7 -> {
                    popNumTxt.text = "${numList[clickCount-1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = mainNumTxt.text
                    subNumTxt02.text = "${numList[clickCount-2]}"
                    subNumTxt03.text = "${numList[clickCount-3]}"
                    subNumTxt04.text = "${numList[clickCount-4]}"
                    subNumTxt05.text = "${numList[clickCount-5]}"
                    subNumTxt06.text = "${numList[clickCount-6]}"
                    subNumTxt07.text = "${numList[clickCount-7]}"
                }

                8 -> {
                    popNumTxt.text = "${numList[clickCount-1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = mainNumTxt.text
                    subNumTxt02.text = "${numList[clickCount-2]}"
                    subNumTxt03.text = "${numList[clickCount-3]}"
                    subNumTxt04.text = "${numList[clickCount-4]}"
                    subNumTxt05.text = "${numList[clickCount-5]}"
                    subNumTxt06.text = "${numList[clickCount-6]}"
                    subNumTxt07.text = "${numList[clickCount-7]}"
                    subNumTxt08.text = "${numList[clickCount-8]}"
                }

                9 -> {
                    popNumTxt.text = "${numList[clickCount-1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = mainNumTxt.text
                    subNumTxt02.text = "${numList[clickCount-2]}"
                    subNumTxt03.text = "${numList[clickCount-3]}"
                    subNumTxt04.text = "${numList[clickCount-4]}"
                    subNumTxt05.text = "${numList[clickCount-5]}"
                    subNumTxt06.text = "${numList[clickCount-6]}"
                    subNumTxt07.text = "${numList[clickCount-7]}"
                    subNumTxt08.text = "${numList[clickCount-8]}"
                    subNumTxt09.text = "${numList[clickCount-9]}"
                }

                10 -> {
                    popNumTxt.text = "${numList[clickCount-1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = mainNumTxt.text
                    subNumTxt02.text = "${numList[clickCount-2]}"
                    subNumTxt03.text = "${numList[clickCount-3]}"
                    subNumTxt04.text = "${numList[clickCount-4]}"
                    subNumTxt05.text = "${numList[clickCount-5]}"
                    subNumTxt06.text = "${numList[clickCount-6]}"
                    subNumTxt07.text = "${numList[clickCount-7]}"
                    subNumTxt08.text = "${numList[clickCount-8]}"
                    subNumTxt09.text = "${numList[clickCount-9]}"
                    subNumTxt10.text = "${numList[clickCount-10]}"
                }

                11 -> {
                    popNumTxt.text = "${numList[clickCount-1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = mainNumTxt.text
                    subNumTxt02.text = "${numList[clickCount-2]}"
                    subNumTxt03.text = "${numList[clickCount-3]}"
                    subNumTxt04.text = "${numList[clickCount-4]}"
                    subNumTxt05.text = "${numList[clickCount-5]}"
                    subNumTxt06.text = "${numList[clickCount-6]}"
                    subNumTxt07.text = "${numList[clickCount-7]}"
                    subNumTxt08.text = "${numList[clickCount-8]}"
                    subNumTxt09.text = "${numList[clickCount-9]}"
                    subNumTxt10.text = "${numList[clickCount-10]}"
                    subNumTxt11.text = "${numList[clickCount-11]}"
                }

                12 -> {
                    popNumTxt.text = "${numList[clickCount-1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = mainNumTxt.text
                    subNumTxt02.text = "${numList[clickCount-2]}"
                    subNumTxt03.text = "${numList[clickCount-3]}"
                    subNumTxt04.text = "${numList[clickCount-4]}"
                    subNumTxt05.text = "${numList[clickCount-5]}"
                    subNumTxt06.text = "${numList[clickCount-6]}"
                    subNumTxt07.text = "${numList[clickCount-7]}"
                    subNumTxt08.text = "${numList[clickCount-8]}"
                    subNumTxt09.text = "${numList[clickCount-9]}"
                    subNumTxt10.text = "${numList[clickCount-10]}"
                    subNumTxt11.text = "${numList[clickCount-11]}"
                    subNumTxt12.text = "${numList[clickCount-12]}"
                }

                13 -> clickCount = 1

            }

//            when(clickCount) {
//                1 -> {popNumTxt.text = "${numQueue.element()}"
//                     mainNumTxt.text = popNumTxt.text
//                     subNumTxt01.text = mainNumTxt.text}
//                2 -> {popNumTxt.text = "${numQueue.element()}"
//                      mainNumTxt.text = popNumTxt.text
//                      subNumTxt01.text = mainNumTxt.text
//                      subNumTxt02.text = "${numQueue.element()}"  }
//                3 -> {popNumTxt.text = "${numQueue.element()}"
//                    mainNumTxt.text = popNumTxt.text
//                    subNumTxt01.text = mainNumTxt.text
//                    subNumTxt02.text = "${numQueue.element()}"
//                    subNumTxt03.text = "${numQueue.element()}" }
//            }


            Handler().postDelayed({
                popNumTxt.visibility = View.GONE
            }, 3000)


//            mainNumTxt.text = popNumTxt.text

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






