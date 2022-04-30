package com.zerdasoftware.usingmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.zerdasoftware.usingmvvm.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var design:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        design = DataBindingUtil.setContentView(this ,R.layout.activity_main)
        design.mainActivityObject = this

        ResultText(0.toString())
    }

    fun buttonCollectionTapped(getNumber1:String,getNumber2:String)
    {
        val number1 = getNumber1.toInt()
        val number2 = getNumber2.toInt()

        val collect = number1 + number2
        ResultText(collect.toString())
    }

    fun buttonMultiplicationTapped(getNumber1:String,getNumber2:String)
    {
        val number1 = getNumber1.toInt()
        val number2 = getNumber2.toInt()

        val multiple = number1 * number2
        ResultText(multiple.toString())
    }

    fun ResultText(text:String){
        design.textViewResult.text = "${text}"
    }
}