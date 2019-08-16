package com.example.myfirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class MultiplyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val num1:Int = intent.getStringExtra("input1").toInt()
        val num2:Int = intent.getStringExtra("input2").toInt()
        val results:Int = intent.getStringExtra("results").toInt()

        if (num1.and(num2) != null){
            var result_act:Int = num1 * num2
            if (result_act == results){
                tv_sec_act.text = result_act.toString()
            }
        }else{
            tv_sec_act.text  = "input correct values"
        }


    }
}
