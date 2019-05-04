package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_calc_app.*

class SecondCalcApp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_calc_app)

        val value1 = intent.getIntExtra("VALUE1", 0)
        val value2 = intent.getIntExtra("VALUE2", 0)
        val value3 = intent.getIntExtra("VALUE3", 0)

        when (value3){
            1 -> textView.text = "${value1 + value2}"
            2 -> textView.text = "${value1 - value2}"
            3 -> textView.text = "${value1 * value2}"
            4 -> textView.text = "${value1 / value2}"
        }
    }
}
