package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second_calc_app.*

class SecondCalcApp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_calc_app)

        try{
            val value1 = intent.getStringExtra("VALUE1")
            val value2 = intent.getStringExtra("VALUE2")
            val value3 = intent.getIntExtra("VALUE3", 0)


        val value4 = value1.toDouble()
        val value5 = value2.toDouble()

        when (value3) {
            1 -> textView.text = "${value4 + value5}"
            2 -> textView.text = "${value4 - value5}"
            3 -> textView.text = "${value4 * value5}"
            4 -> textView.text = "${value4 / value5}"

        }
        } catch (e:Exception){
            textView.text= "Invalid input!"
        }

        }

    }

