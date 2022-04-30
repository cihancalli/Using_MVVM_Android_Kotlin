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
        design.textViewResult.text = "0"

        design.buttonCollection.setOnClickListener {
            val getNumber1 = design.editTextSayi1.text.toString()
            val getNumber2 = design.editTextSayi2.text.toString()

            val number1 = getNumber1.toInt()
            val number2 = getNumber2.toInt()

            val collect = number1 + number2

            design.textViewResult.text = "${collect}"
        }

        design.buttonMultiplication.setOnClickListener {
            val getNumber1 = design.editTextSayi1.text.toString()
            val getNumber2 = design.editTextSayi2.text.toString()

            val number1 = getNumber1.toInt()
            val number2 = getNumber2.toInt()

            val multiple = number1 * number2

            design.textViewResult.text = "${multiple}"
        }
    }
}