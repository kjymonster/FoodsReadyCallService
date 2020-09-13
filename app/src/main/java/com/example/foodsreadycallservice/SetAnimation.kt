package com.example.foodsreadycallservice

import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import kotlinx.android.synthetic.main.activity_main.*

class SetAnimation : BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var anim: Animation
        var start = false



        anim = AlphaAnimation(0.0f, 1.0f) //투명도. 0.0~1.0
        anim.setDuration(1500)  //지속시간. (100) = 100 = 1초
//            anim.setStartOffset(10) //한번 애니메이션이 시작하기위해 대기하는 시간
//            anim.setRepeatMode(Animation.REVERSE) //반복
        anim.setRepeatCount(5) //몇번 반복할지

        if (mainNumTxt.text != null) {
            if (!start) {
//                    start = true
            } else {
                start = false;
            }

            anim.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationRepeat(p0: Animation?) {}

                override fun onAnimationEnd(animation: Animation) {


                }

                override fun onAnimationStart(p0: Animation?) {

                }
            })
        }


    }



    override fun setupEvents() {

    }

    override fun setValues() {

    }

}


