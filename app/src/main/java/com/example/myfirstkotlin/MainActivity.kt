package com.example.myfirstkotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


// use comma and no brackets to implement interfaces eg. class MainActivity : AppCompatActivity, TestKotlin{}
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(p0: View?) {

        var results: Int = 0
        var num1: Int = 0
        var num2: Int = 0
        var intent: Intent? = null


        if (et_first_input.text.isEmpty() || et_second_input.text.isEmpty()) {
            tv_result.text = "Please insert the value "
        } else {
            num1 = et_first_input.text.toString().toInt()
            num2 = et_second_input.text.toString().toInt()

            when(p0!!.id){
                R.id.btn_add -> {
                    results = num1 + num2
                    tv_result.text = results.toString();
                    intent = Intent(this,SecondActivity::class.java)
                    intent.putExtra("input1", num1.toString())
                    intent.putExtra("input2", num2.toString())
                    intent.putExtra("results", results.toString())
                    //startActivity(intent)
                }
                R.id.btn_subtract ->{
                    results = num1 - num2
                    tv_result.text = results.toString()
                    intent = Intent(this,SubtractActivity::class.java)
                    intent.putExtra("input1", num1.toString())
                    intent.putExtra("input2", num2.toString())
                    intent.putExtra("results", results.toString())
                    //startActivity(intent)
                }

                R.id.btn_multiple ->{
                    results = num1 * num2
                    tv_result.text = results.toString()
                    intent = Intent(this,MultiplyActivity::class.java)
                    intent.putExtra("input1", num1.toString())
                    intent.putExtra("input2", num2.toString())
                    intent.putExtra("results", results.toString())
                    //startActivity(intent)
                }

                R.id.btn_divide ->{

                    if (num2 == 0) {
                        tv_result.text = "Please don't divide a number by zero"
                    } else {
                        results = num1 / num2
                        tv_result.text = results.toString()
                        intent = Intent(this,DivideActivity::class.java)
                        intent.putExtra("input1", num1.toString())
                        intent.putExtra("input2", num2.toString())
                        intent.putExtra("results", results.toString())
                        //startActivity(intent)

                    }
                }

                R.id.btn_nxt_act ->{
                    intent = Intent(this,SecondActivity::class.java)
                    intent.putExtra("results", results)
                    //startActivity(intent)
                }
            }

            startActivity(intent)


        }




    }






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_add.setOnClickListener(this)
        btn_subtract.setOnClickListener(this)
        btn_multiple.setOnClickListener(this)
        btn_divide.setOnClickListener(this)
        btn_nxt_act.setOnClickListener(this)




       /* //var is changable while val is unchangable
        private var testName1: String = "Mohammad"
        private val testname2: String = "Gus"
        public var testName3: String = "Jake"
        public val testName4: String = "Rod"

        //tv_main.setText(testname2)

        // can also use .text to get and set values for textview
        //tv_main.text = testName1

        btn_add.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (et_first_input.text.isNotEmpty() && et_second_input.text.isNotEmpty()){
                    tv_result.text = (Integer.parseInt(et_first_input.text.toString()) + Integer.parseInt(et_second_input.text.toString())).toString()
                }
            }
        })

        btn_subtract.setOnClickListener {
            if (et_first_input.text.isNotEmpty() && et_second_input.text.isNotEmpty()){
                tv_result.text = (Integer.parseInt(et_first_input.text.toString()) - Integer.parseInt(et_second_input.text.toString())).toString()
            }
        }


        btn_multiple.setOnClickListener {
            if (et_first_input.text.isNotEmpty() && et_second_input.text.isNotEmpty()){
                tv_result.text = (Integer.parseInt(et_first_input.text.toString()) * Integer.parseInt(et_second_input.text.toString())).toString()
            }
        }

        btn_divide.setOnClickListener {
            if (et_first_input.text.isNotEmpty() && Integer.parseInt(et_second_input.text.toString()) > 0){
                tv_result.text = (Integer.parseInt(et_first_input.text.toString()) / Integer.parseInt(et_second_input.text.toString())).toString()
            }else{
                tv_result.text = "your a 110011"
            }
        }

        btn_nxt_act.setOnClickListener {

            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("input1", et_first_input.text.toString())
            intent.putExtra("input2", et_second_input.text.toString())
            startActivity(intent)
        }*/



    }

}
