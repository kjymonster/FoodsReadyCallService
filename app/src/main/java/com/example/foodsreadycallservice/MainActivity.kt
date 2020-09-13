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



        callBtn.setOnClickListener {
            popNumTxt.visibility = View.VISIBLE
            clickCount = clickCount + 1




            when (clickCount) {
                1 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "00${numList[clickCount - 1]}"
                }
                2 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "00${numList[clickCount - 1]}"
                    subNumTxt02.text = "00${numList[clickCount - 2]}"
                }

                3 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "00${numList[clickCount - 1]}"
                    subNumTxt02.text = "00${numList[clickCount - 2]}"
                    subNumTxt03.text = "00${numList[clickCount - 3]}"
                }

                4 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "00${numList[clickCount - 1]}"
                    subNumTxt02.text = "00${numList[clickCount - 2]}"
                    subNumTxt03.text = "00${numList[clickCount - 3]}"
                    subNumTxt04.text = "00${numList[clickCount - 4]}"
                }

                5 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "00${numList[clickCount - 1]}"
                    subNumTxt02.text = "00${numList[clickCount - 2]}"
                    subNumTxt03.text = "00${numList[clickCount - 3]}"
                    subNumTxt04.text = "00${numList[clickCount - 4]}"
                    subNumTxt05.text = "00${numList[clickCount - 5]}"
                }

                6 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "00${numList[clickCount - 1]}"
                    subNumTxt02.text = "00${numList[clickCount - 2]}"
                    subNumTxt03.text = "00${numList[clickCount - 3]}"
                    subNumTxt04.text = "00${numList[clickCount - 4]}"
                    subNumTxt05.text = "00${numList[clickCount - 5]}"
                    subNumTxt06.text = "00${numList[clickCount - 6]}"
                }

                7 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "00${numList[clickCount - 1]}"
                    subNumTxt02.text = "00${numList[clickCount - 2]}"
                    subNumTxt03.text = "00${numList[clickCount - 3]}"
                    subNumTxt04.text = "00${numList[clickCount - 4]}"
                    subNumTxt05.text = "00${numList[clickCount - 5]}"
                    subNumTxt06.text = "00${numList[clickCount - 6]}"
                    subNumTxt07.text = "00${numList[clickCount - 7]}"
                }

                8 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "00${numList[clickCount - 1]}"
                    subNumTxt02.text = "00${numList[clickCount - 2]}"
                    subNumTxt03.text = "00${numList[clickCount - 3]}"
                    subNumTxt04.text = "00${numList[clickCount - 4]}"
                    subNumTxt05.text = "00${numList[clickCount - 5]}"
                    subNumTxt06.text = "00${numList[clickCount - 6]}"
                    subNumTxt07.text = "00${numList[clickCount - 7]}"
                    subNumTxt08.text = "00${numList[clickCount - 8]}"
                }

                9 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "00${numList[clickCount - 1]}"
                    subNumTxt02.text = "00${numList[clickCount - 2]}"
                    subNumTxt03.text = "00${numList[clickCount - 3]}"
                    subNumTxt04.text = "00${numList[clickCount - 4]}"
                    subNumTxt05.text = "00${numList[clickCount - 5]}"
                    subNumTxt06.text = "00${numList[clickCount - 6]}"
                    subNumTxt07.text = "00${numList[clickCount - 7]}"
                    subNumTxt08.text = "00${numList[clickCount - 8]}"
                    subNumTxt09.text = "00${numList[clickCount - 9]}"
                }

                10 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "0${numList[clickCount - 1]}"
                    subNumTxt02.text = "00${numList[clickCount - 2]}"
                    subNumTxt03.text = "00${numList[clickCount - 3]}"
                    subNumTxt04.text = "00${numList[clickCount - 4]}"
                    subNumTxt05.text = "00${numList[clickCount - 5]}"
                    subNumTxt06.text = "00${numList[clickCount - 6]}"
                    subNumTxt07.text = "00${numList[clickCount - 7]}"
                    subNumTxt08.text = "00${numList[clickCount - 8]}"
                    subNumTxt09.text = "00${numList[clickCount - 9]}"
                    subNumTxt10.text = "00${numList[clickCount - 10]}"
                }

                11 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "0${numList[clickCount - 1]}"
                    subNumTxt02.text = "0${numList[clickCount - 2]}"
                    subNumTxt03.text = "00${numList[clickCount - 3]}"
                    subNumTxt04.text = "00${numList[clickCount - 4]}"
                    subNumTxt05.text = "00${numList[clickCount - 5]}"
                    subNumTxt06.text = "00${numList[clickCount - 6]}"
                    subNumTxt07.text = "00${numList[clickCount - 7]}"
                    subNumTxt08.text = "00${numList[clickCount - 8]}"
                    subNumTxt09.text = "00${numList[clickCount - 9]}"
                    subNumTxt10.text = "00${numList[clickCount - 10]}"
                    subNumTxt11.text = "00${numList[clickCount - 11]}"
                }

                12 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "0${numList[clickCount - 1]}"
                    subNumTxt02.text = "0${numList[clickCount - 2]}"
                    subNumTxt03.text = "0${numList[clickCount - 3]}"
                    subNumTxt04.text = "00${numList[clickCount - 4]}"
                    subNumTxt05.text = "00${numList[clickCount - 5]}"
                    subNumTxt06.text = "00${numList[clickCount - 6]}"
                    subNumTxt07.text = "00${numList[clickCount - 7]}"
                    subNumTxt08.text = "00${numList[clickCount - 8]}"
                    subNumTxt09.text = "00${numList[clickCount - 9]}"
                    subNumTxt10.text = "00${numList[clickCount - 10]}"
                    subNumTxt11.text = "00${numList[clickCount - 11]}"
                    subNumTxt12.text = "00${numList[clickCount - 12]}"
                }

                13 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "0${numList[clickCount - 1]}"
                    subNumTxt02.text = "0${numList[clickCount - 2]}"
                    subNumTxt03.text = "0${numList[clickCount - 3]}"
                    subNumTxt04.text = "0${numList[clickCount - 4]}"
                    subNumTxt05.text = "00${numList[clickCount - 5]}"
                    subNumTxt06.text = "00${numList[clickCount - 6]}"
                    subNumTxt07.text = "00${numList[clickCount - 7]}"
                    subNumTxt08.text = "00${numList[clickCount - 8]}"
                    subNumTxt09.text = "00${numList[clickCount - 9]}"
                    subNumTxt10.text = "00${numList[clickCount - 10]}"
                    subNumTxt11.text = "00${numList[clickCount - 11]}"
                    subNumTxt12.text = "00${numList[clickCount - 12]}"
                }

                14 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "0${numList[clickCount - 1]}"
                    subNumTxt02.text = "0${numList[clickCount - 2]}"
                    subNumTxt03.text = "0${numList[clickCount - 3]}"
                    subNumTxt04.text = "0${numList[clickCount - 4]}"
                    subNumTxt05.text = "0${numList[clickCount - 5]}"
                    subNumTxt06.text = "00${numList[clickCount - 6]}"
                    subNumTxt07.text = "00${numList[clickCount - 7]}"
                    subNumTxt08.text = "00${numList[clickCount - 8]}"
                    subNumTxt09.text = "00${numList[clickCount - 9]}"
                    subNumTxt10.text = "00${numList[clickCount - 10]}"
                    subNumTxt11.text = "00${numList[clickCount - 11]}"
                    subNumTxt12.text = "00${numList[clickCount - 12]}"
                }

                 15 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "0${numList[clickCount - 1]}"
                    subNumTxt02.text = "0${numList[clickCount - 2]}"
                    subNumTxt03.text = "0${numList[clickCount - 3]}"
                    subNumTxt04.text = "0${numList[clickCount - 4]}"
                    subNumTxt05.text = "0${numList[clickCount - 5]}"
                    subNumTxt06.text = "0${numList[clickCount - 6]}"
                    subNumTxt07.text = "00${numList[clickCount - 7]}"
                    subNumTxt08.text = "00${numList[clickCount - 8]}"
                    subNumTxt09.text = "00${numList[clickCount - 9]}"
                    subNumTxt10.text = "00${numList[clickCount - 10]}"
                    subNumTxt11.text = "00${numList[clickCount - 11]}"
                    subNumTxt12.text = "00${numList[clickCount - 12]}"
                }

                16 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "0${numList[clickCount - 1]}"
                    subNumTxt02.text = "0${numList[clickCount - 2]}"
                    subNumTxt03.text = "0${numList[clickCount - 3]}"
                    subNumTxt04.text = "0${numList[clickCount - 4]}"
                    subNumTxt05.text = "0${numList[clickCount - 5]}"
                    subNumTxt06.text = "0${numList[clickCount - 6]}"
                    subNumTxt07.text = "0${numList[clickCount - 7]}"
                    subNumTxt08.text = "00${numList[clickCount - 8]}"
                    subNumTxt09.text = "00${numList[clickCount - 9]}"
                    subNumTxt10.text = "00${numList[clickCount - 10]}"
                    subNumTxt11.text = "00${numList[clickCount - 11]}"
                    subNumTxt12.text = "00${numList[clickCount - 12]}"
                }

                17 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "0${numList[clickCount - 1]}"
                    subNumTxt02.text = "0${numList[clickCount - 2]}"
                    subNumTxt03.text = "0${numList[clickCount - 3]}"
                    subNumTxt04.text = "0${numList[clickCount - 4]}"
                    subNumTxt05.text = "0${numList[clickCount - 5]}"
                    subNumTxt06.text = "0${numList[clickCount - 6]}"
                    subNumTxt07.text = "0${numList[clickCount - 7]}"
                    subNumTxt08.text = "0${numList[clickCount - 8]}"
                    subNumTxt09.text = "00${numList[clickCount - 9]}"
                    subNumTxt10.text = "00${numList[clickCount - 10]}"
                    subNumTxt11.text = "00${numList[clickCount - 11]}"
                    subNumTxt12.text = "00${numList[clickCount - 12]}"
                }
                18 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "0${numList[clickCount - 1]}"
                    subNumTxt02.text = "0${numList[clickCount - 2]}"
                    subNumTxt03.text = "0${numList[clickCount - 3]}"
                    subNumTxt04.text = "0${numList[clickCount - 4]}"
                    subNumTxt05.text = "0${numList[clickCount - 5]}"
                    subNumTxt06.text = "0${numList[clickCount - 6]}"
                    subNumTxt07.text = "0${numList[clickCount - 7]}"
                    subNumTxt08.text = "0${numList[clickCount - 8]}"
                    subNumTxt09.text = "0${numList[clickCount - 9]}"
                    subNumTxt10.text = "00${numList[clickCount - 10]}"
                    subNumTxt11.text = "00${numList[clickCount - 11]}"
                    subNumTxt12.text = "00${numList[clickCount - 12]}"
                }

                19 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "0${numList[clickCount - 1]}"
                    subNumTxt02.text = "0${numList[clickCount - 2]}"
                    subNumTxt03.text = "0${numList[clickCount - 3]}"
                    subNumTxt04.text = "0${numList[clickCount - 4]}"
                    subNumTxt05.text = "0${numList[clickCount - 5]}"
                    subNumTxt06.text = "0${numList[clickCount - 6]}"
                    subNumTxt07.text = "0${numList[clickCount - 7]}"
                    subNumTxt08.text = "0${numList[clickCount - 8]}"
                    subNumTxt09.text = "0${numList[clickCount - 9]}"
                    subNumTxt10.text = "0${numList[clickCount - 10]}"
                    subNumTxt11.text = "00${numList[clickCount - 11]}"
                    subNumTxt12.text = "00${numList[clickCount - 12]}"
                }

                20 -> {
                popNumTxt.text = "${numList[clickCount - 1]}"
                mainNumTxt.text = popNumTxt.text
                subNumTxt01.text = "0${numList[clickCount - 1]}"
                subNumTxt02.text = "0${numList[clickCount - 2]}"
                subNumTxt03.text = "0${numList[clickCount - 3]}"
                subNumTxt04.text = "0${numList[clickCount - 4]}"
                subNumTxt05.text = "0${numList[clickCount - 5]}"
                subNumTxt06.text = "0${numList[clickCount - 6]}"
                subNumTxt07.text = "0${numList[clickCount - 7]}"
                subNumTxt08.text = "0${numList[clickCount - 8]}"
                subNumTxt09.text = "0${numList[clickCount - 9]}"
                subNumTxt10.text = "0${numList[clickCount - 10]}"
                subNumTxt11.text = "0${numList[clickCount - 11]}"
                subNumTxt12.text = "00${numList[clickCount - 12]}"
            }
                21 -> {
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text
                    subNumTxt01.text = "0${numList[clickCount - 1]}"
                    subNumTxt02.text = "0${numList[clickCount - 2]}"
                    subNumTxt03.text = "0${numList[clickCount - 3]}"
                    subNumTxt04.text = "0${numList[clickCount - 4]}"
                    subNumTxt05.text = "0${numList[clickCount - 5]}"
                    subNumTxt06.text = "0${numList[clickCount - 6]}"
                    subNumTxt07.text = "0${numList[clickCount - 7]}"
                    subNumTxt08.text = "0${numList[clickCount - 8]}"
                    subNumTxt09.text = "0${numList[clickCount - 9]}"
                    subNumTxt10.text = "0${numList[clickCount - 10]}"
                    subNumTxt11.text = "0${numList[clickCount - 11]}"
                    subNumTxt12.text = "0${numList[clickCount - 12]}"
                }

                else -> {

                    if ("${numList[clickCount - 1]}".toInt() >21 && "${numList[clickCount - 1]}".toInt() < 100 ) {
                        subNumTxt01.text = "0${numList[clickCount - 1]}"
                        subNumTxt02.text = "0${numList[clickCount - 2]}"
                        subNumTxt03.text = "0${numList[clickCount - 3]}"
                        subNumTxt04.text = "0${numList[clickCount - 4]}"
                        subNumTxt05.text = "0${numList[clickCount - 5]}"
                        subNumTxt06.text = "0${numList[clickCount - 6]}"
                        subNumTxt07.text = "0${numList[clickCount - 7]}"
                        subNumTxt08.text = "0${numList[clickCount - 8]}"
                        subNumTxt09.text = "0${numList[clickCount - 9]}"
                        subNumTxt10.text = "0${numList[clickCount - 10]}"
                        subNumTxt11.text = "0${numList[clickCount - 11]}"
                        subNumTxt12.text = "0${numList[clickCount - 12]}"
                    } else if("${numList[clickCount - 1]}".toInt() == 100 ) {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "0${numList[clickCount - 2]}"
                        subNumTxt03.text = "0${numList[clickCount - 3]}"
                        subNumTxt04.text = "0${numList[clickCount - 4]}"
                        subNumTxt05.text = "0${numList[clickCount - 5]}"
                        subNumTxt06.text = "0${numList[clickCount - 6]}"
                        subNumTxt07.text = "0${numList[clickCount - 7]}"
                        subNumTxt08.text = "0${numList[clickCount - 8]}"
                        subNumTxt09.text = "0${numList[clickCount - 9]}"
                        subNumTxt10.text = "0${numList[clickCount - 10]}"
                        subNumTxt11.text = "0${numList[clickCount - 11]}"
                        subNumTxt12.text = "0${numList[clickCount - 12]}"
                    } else if("${numList[clickCount - 1]}".toInt() == 101 ) {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "${numList[clickCount - 2]}"
                        subNumTxt03.text = "0${numList[clickCount - 3]}"
                        subNumTxt04.text = "0${numList[clickCount - 4]}"
                        subNumTxt05.text = "0${numList[clickCount - 5]}"
                        subNumTxt06.text = "0${numList[clickCount - 6]}"
                        subNumTxt07.text = "0${numList[clickCount - 7]}"
                        subNumTxt08.text = "0${numList[clickCount - 8]}"
                        subNumTxt09.text = "0${numList[clickCount - 9]}"
                        subNumTxt10.text = "0${numList[clickCount - 10]}"
                        subNumTxt11.text = "0${numList[clickCount - 11]}"
                        subNumTxt12.text = "0${numList[clickCount - 12]}"
                    }else if("${numList[clickCount - 1]}".toInt() == 102 ) {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "${numList[clickCount - 2]}"
                        subNumTxt03.text = "${numList[clickCount - 3]}"
                        subNumTxt04.text = "0${numList[clickCount - 4]}"
                        subNumTxt05.text = "0${numList[clickCount - 5]}"
                        subNumTxt06.text = "0${numList[clickCount - 6]}"
                        subNumTxt07.text = "0${numList[clickCount - 7]}"
                        subNumTxt08.text = "0${numList[clickCount - 8]}"
                        subNumTxt09.text = "0${numList[clickCount - 9]}"
                        subNumTxt10.text = "0${numList[clickCount - 10]}"
                        subNumTxt11.text = "0${numList[clickCount - 11]}"
                        subNumTxt12.text = "0${numList[clickCount - 12]}"
                    }else if("${numList[clickCount - 1]}".toInt() == 103 ) {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "${numList[clickCount - 2]}"
                        subNumTxt03.text = "${numList[clickCount - 3]}"
                        subNumTxt04.text = "${numList[clickCount - 4]}"
                        subNumTxt05.text = "0${numList[clickCount - 5]}"
                        subNumTxt06.text = "0${numList[clickCount - 6]}"
                        subNumTxt07.text = "0${numList[clickCount - 7]}"
                        subNumTxt08.text = "0${numList[clickCount - 8]}"
                        subNumTxt09.text = "0${numList[clickCount - 9]}"
                        subNumTxt10.text = "0${numList[clickCount - 10]}"
                        subNumTxt11.text = "0${numList[clickCount - 11]}"
                        subNumTxt12.text = "0${numList[clickCount - 12]}"
                    }else if("${numList[clickCount - 1]}".toInt() == 104 ) {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "${numList[clickCount - 2]}"
                        subNumTxt03.text = "${numList[clickCount - 3]}"
                        subNumTxt04.text = "${numList[clickCount - 4]}"
                        subNumTxt05.text = "${numList[clickCount - 5]}"
                        subNumTxt06.text = "0${numList[clickCount - 6]}"
                        subNumTxt07.text = "0${numList[clickCount - 7]}"
                        subNumTxt08.text = "0${numList[clickCount - 8]}"
                        subNumTxt09.text = "0${numList[clickCount - 9]}"
                        subNumTxt10.text = "0${numList[clickCount - 10]}"
                        subNumTxt11.text = "0${numList[clickCount - 11]}"
                        subNumTxt12.text = "0${numList[clickCount - 12]}"
                    }else if("${numList[clickCount - 1]}".toInt() == 105 ) {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "${numList[clickCount - 2]}"
                        subNumTxt03.text = "${numList[clickCount - 3]}"
                        subNumTxt04.text = "${numList[clickCount - 4]}"
                        subNumTxt05.text = "${numList[clickCount - 5]}"
                        subNumTxt06.text = "${numList[clickCount - 6]}"
                        subNumTxt07.text = "0${numList[clickCount - 7]}"
                        subNumTxt08.text = "0${numList[clickCount - 8]}"
                        subNumTxt09.text = "0${numList[clickCount - 9]}"
                        subNumTxt10.text = "0${numList[clickCount - 10]}"
                        subNumTxt11.text = "0${numList[clickCount - 11]}"
                        subNumTxt12.text = "0${numList[clickCount - 12]}"
                    }else if("${numList[clickCount - 1]}".toInt() == 106 ) {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "${numList[clickCount - 2]}"
                        subNumTxt03.text = "${numList[clickCount - 3]}"
                        subNumTxt04.text = "${numList[clickCount - 4]}"
                        subNumTxt05.text = "${numList[clickCount - 5]}"
                        subNumTxt06.text = "${numList[clickCount - 6]}"
                        subNumTxt07.text = "${numList[clickCount - 7]}"
                        subNumTxt08.text = "0${numList[clickCount - 8]}"
                        subNumTxt09.text = "0${numList[clickCount - 9]}"
                        subNumTxt10.text = "0${numList[clickCount - 10]}"
                        subNumTxt11.text = "0${numList[clickCount - 11]}"
                        subNumTxt12.text = "0${numList[clickCount - 12]}"
                    }else if("${numList[clickCount - 1]}".toInt() == 107 ) {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "${numList[clickCount - 2]}"
                        subNumTxt03.text = "${numList[clickCount - 3]}"
                        subNumTxt04.text = "${numList[clickCount - 4]}"
                        subNumTxt05.text = "${numList[clickCount - 5]}"
                        subNumTxt06.text = "${numList[clickCount - 6]}"
                        subNumTxt07.text = "${numList[clickCount - 7]}"
                        subNumTxt08.text = "${numList[clickCount - 8]}"
                        subNumTxt09.text = "0${numList[clickCount - 9]}"
                        subNumTxt10.text = "0${numList[clickCount - 10]}"
                        subNumTxt11.text = "0${numList[clickCount - 11]}"
                        subNumTxt12.text = "0${numList[clickCount - 12]}"
                    }else if("${numList[clickCount - 1]}".toInt() == 108 ) {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "${numList[clickCount - 2]}"
                        subNumTxt03.text = "${numList[clickCount - 3]}"
                        subNumTxt04.text = "${numList[clickCount - 4]}"
                        subNumTxt05.text = "${numList[clickCount - 5]}"
                        subNumTxt06.text = "${numList[clickCount - 6]}"
                        subNumTxt07.text = "${numList[clickCount - 7]}"
                        subNumTxt08.text = "${numList[clickCount - 8]}"
                        subNumTxt09.text = "${numList[clickCount - 9]}"
                        subNumTxt10.text = "0${numList[clickCount - 10]}"
                        subNumTxt11.text = "0${numList[clickCount - 11]}"
                        subNumTxt12.text = "0${numList[clickCount - 12]}"
                    }else if("${numList[clickCount - 1]}".toInt() == 109 ) {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "${numList[clickCount - 2]}"
                        subNumTxt03.text = "${numList[clickCount - 3]}"
                        subNumTxt04.text = "${numList[clickCount - 4]}"
                        subNumTxt05.text = "${numList[clickCount - 5]}"
                        subNumTxt06.text = "${numList[clickCount - 6]}"
                        subNumTxt07.text = "${numList[clickCount - 7]}"
                        subNumTxt08.text = "${numList[clickCount - 8]}"
                        subNumTxt09.text = "${numList[clickCount - 9]}"
                        subNumTxt10.text = "${numList[clickCount - 10]}"
                        subNumTxt11.text = "0${numList[clickCount - 11]}"
                        subNumTxt12.text = "0${numList[clickCount - 12]}"
                    }else if("${numList[clickCount - 1]}".toInt() == 110 ) {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "${numList[clickCount - 2]}"
                        subNumTxt03.text = "${numList[clickCount - 3]}"
                        subNumTxt04.text = "${numList[clickCount - 4]}"
                        subNumTxt05.text = "${numList[clickCount - 5]}"
                        subNumTxt06.text = "${numList[clickCount - 6]}"
                        subNumTxt07.text = "${numList[clickCount - 7]}"
                        subNumTxt08.text = "${numList[clickCount - 8]}"
                        subNumTxt09.text = "${numList[clickCount - 9]}"
                        subNumTxt10.text = "${numList[clickCount - 10]}"
                        subNumTxt11.text = "${numList[clickCount - 11]}"
                        subNumTxt12.text = "0${numList[clickCount - 12]}"
                    }else if("${numList[clickCount - 1]}".toInt() == 111 ) {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "${numList[clickCount - 2]}"
                        subNumTxt03.text = "${numList[clickCount - 3]}"
                        subNumTxt04.text = "${numList[clickCount - 4]}"
                        subNumTxt05.text = "${numList[clickCount - 5]}"
                        subNumTxt06.text = "${numList[clickCount - 6]}"
                        subNumTxt07.text = "${numList[clickCount - 7]}"
                        subNumTxt08.text = "${numList[clickCount - 8]}"
                        subNumTxt09.text = "${numList[clickCount - 9]}"
                        subNumTxt10.text = "${numList[clickCount - 10]}"
                        subNumTxt11.text = "${numList[clickCount - 11]}"
                        subNumTxt12.text = "${numList[clickCount - 12]}"
                    }else {
                        subNumTxt01.text = "${numList[clickCount - 1]}"
                        subNumTxt02.text = "${numList[clickCount - 2]}"
                        subNumTxt03.text = "${numList[clickCount - 3]}"
                        subNumTxt04.text = "${numList[clickCount - 4]}"
                        subNumTxt05.text = "${numList[clickCount - 5]}"
                        subNumTxt06.text = "${numList[clickCount - 6]}"
                        subNumTxt07.text = "${numList[clickCount - 7]}"
                        subNumTxt08.text = "${numList[clickCount - 8]}"
                        subNumTxt09.text = "${numList[clickCount - 9]}"
                        subNumTxt10.text = "${numList[clickCount - 10]}"
                        subNumTxt11.text = "${numList[clickCount - 11]}"
                        subNumTxt12.text = "${numList[clickCount - 12]}"
                    }
                    popNumTxt.text = "${numList[clickCount - 1]}"
                    mainNumTxt.text = popNumTxt.text


                }

            }



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






