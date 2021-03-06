package com.example.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        val first = editText1.text.toString()
        val second = editText2.text.toString()
        if(v.id == R.id.button1){
            val intent = Intent(this, SecondCalcApp::class.java)
            intent.putExtra("VALUE1", first)
            intent.putExtra("VALUE2", second)
            intent.putExtra("VALUE3", 1)
            startActivity(intent)
        } else if (v.id == R.id.button2){
            val intent = Intent(this, SecondCalcApp::class.java)
            intent.putExtra("VALUE1", first)
            intent.putExtra("VALUE2", second)
            intent.putExtra("VALUE3", 2)
            startActivity(intent)
        } else if(v.id == R.id.button3){
            val intent = Intent(this, SecondCalcApp::class.java)
            intent.putExtra("VALUE1", first)
            intent.putExtra("VALUE2", second)
            intent.putExtra("VALUE3", 3)
            startActivity(intent)
        } else if(v.id == R.id.button4){
            val intent = Intent(this, SecondCalcApp::class.java)
            intent.putExtra("VALUE1", first)
            intent.putExtra("VALUE2", second)
            intent.putExtra("VALUE3", 4)
            startActivity(intent)
        }

    }
}
