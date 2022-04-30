package com.zerdasoftware.usingmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView_result.text = "0"

        button_collection.setOnClickListener {
            val getNumber1 = editText_sayi_1.text.toString()
            val getNumber2 = editText_sayi_2.text.toString()

            val number1 = getNumber1.toInt()
            val number2 = getNumber2.toInt()

            val collect = number1 + number2

            textView_result.text = "${collect}"
        }

        button_multiplication.setOnClickListener {
            val getNumber1 = editText_sayi_1.text.toString()
            val getNumber2 = editText_sayi_2.text.toString()

            val number1 = getNumber1.toInt()
            val number2 = getNumber2.toInt()

            val multiple = number1 * number2

            textView_result.text = "${multiple}"
        }
    }
}