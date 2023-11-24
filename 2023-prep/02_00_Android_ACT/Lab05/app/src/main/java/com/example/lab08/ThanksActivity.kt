package com.example.lab08

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class ThanksActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thanks)
        findViewById<TextView>(R.id.nameId).text = intent.getStringExtra("name")
        findViewById<TextView>(R.id.phoneNumberId).text = intent.getStringExtra("phoneNumber")
        findViewById<TextView>(R.id.pizzaSizeId).text = intent.getStringExtra("pizzaSize")
        findViewById<TextView>(R.id.pickUpDateId).text = intent.getStringExtra("date")
        findViewById<TextView>(R.id.pickUpTimeId).text = intent.getStringExtra("time")
        findViewById<Button>(R.id.sendBtn).setOnClickListener {
            findViewById<TextView>(R.id.resultFeedBackId).text = findViewById<RatingBar>(R.id.ratingBar).rating.toString()
        }
    }
}