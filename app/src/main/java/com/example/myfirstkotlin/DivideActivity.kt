package com.example.myfirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class DivideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var num1:Int = intent.getStringExtra("input1")!!.toInt()
        var num2:Int = intent.getStringExtra("input2")!!.toInt()
        var results:Int = intent.getStringExtra("results")!!.toInt()

        if (num2 ==0){
            tv_sec_act.text = "change second value"
        }else{
            val result_act:Int = num1 / num2
            if (result_act == results){
                tv_sec_act.text = result_act.toString()
            }else{
                tv_sec_act.text = "something went wrong"
            }
        }
    }
}
