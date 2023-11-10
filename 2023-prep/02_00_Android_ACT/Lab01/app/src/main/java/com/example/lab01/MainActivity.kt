package com.example.lab01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val n1 = findViewById<EditText>(R.id.num1).text
        val n2 =findViewById<EditText>(R.id.num2).text
        var numberResult = 0.0
        findViewById<Button>(R.id.plus_button).setOnClickListener {
            numberResult = n1.toString().toDouble() + n2.toString().toDouble()
            findViewById<TextView>(R.id.res).text = numberResult.toString()
        }
        findViewById<Button>(R.id.subtract_button).setOnClickListener {
            numberResult = n1.toString().toDouble() - n2.toString().toDouble()
            findViewById<TextView>(R.id.res).text = numberResult.toString()
        }

        findViewById<Button>(R.id.multiply_button).setOnClickListener {
            numberResult = n1.toString().toDouble() * n2.toString().toDouble()
            findViewById<TextView>(R.id.res).text = numberResult.toString()
        }

        findViewById<Button>(R.id.divide_button).setOnClickListener {
            numberResult = n1.toString().toDouble() / n2.toString().toDouble()
            findViewById<TextView>(R.id.res).text = numberResult.toString()
        }

    }
}