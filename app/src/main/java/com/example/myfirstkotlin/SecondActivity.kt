package com.example.myfirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), View.OnClickListener{
    override fun onClick(p0: View?) {

        var value:String = ""
        var result:String = "hey"
        when(p0!!.id){
            R.id.btn_sec_act_1 -> {result = "lmfao" + ": " + value}
            R.id.btn_sec_act_2 -> {result = "tgif" + ": " + value}
            R.id.btn_sec_act_3 -> {result = "Snm" + ": " + value}
        }

        tv_sec_act.text = result.toString()




    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val num1:Int = intent.getStringExtra("input1").toInt()
        val num2:Int = intent.getStringExtra("input2").toInt()
        val results:Int = intent.getStringExtra("results").toInt()

        if (num1.and(num2) != null){
            var result_act:Int = num1 + num2
            if (result_act == results){
                tv_sec_act.text = result_act.toString()
            }
        }else{
            tv_sec_act.text  = "input correct values"
        }

        btn_sec_act_1.setOnClickListener(this)
        btn_sec_act_2.setOnClickListener(this)
        btn_sec_act_3.setOnClickListener(this)
    }
}

/*



*********    correct structure for WHEN implementation      ********************


// ? for nullable or !! for non-nullable




override fun onClick(p0: View?) {

    // ? for nullable or !! for non-nullable
    var value: Int = 0
    when (p0!!.id) {
        R.id.btn_sec_act_1 -> {
            value =
                (Integer.parseInt(et_first_input.text.toString()) + Integer.parseInt(et_second_input.text.toString()))
            //tv_sec_act.text = "lmfao" + value
        }
        R.id.btn_sec_act_2 -> {
            value =
                (Integer.parseInt(et_first_input.text.toString()) + Integer.parseInt(et_second_input.text.toString()))
        }
        R.id.btn_sec_act_3 -> {
            value =
                (Integer.parseInt(et_first_input.text.toString()) + Integer.parseInt(et_second_input.text.toString()))
        }
    }
    tv_result.text = value.toString()
}*/
