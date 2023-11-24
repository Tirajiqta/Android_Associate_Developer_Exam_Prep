package com.example.mailscheduleapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Confirm : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)
        findViewById<TextView>(R.id.nameTv).text = intent.getStringExtra("name")
        findViewById<TextView>(R.id.addressTv).text = intent.getStringExtra("address")
        findViewById<TextView>(R.id.cityTv).text = intent.getStringExtra("city")
        findViewById<TextView>(R.id.stateTv).text = intent.getStringExtra("state")
        findViewById<TextView>(R.id.zipTv).text = intent.getStringExtra("zipCode")
        findViewById<TextView>(R.id.countryTv).text = intent.getStringExtra("country")


    }

    fun Accept(view: View) {
        startActivity(Intent(this, Thanks::class.java))
    }

    fun Edit(view: View) {
        onBackPressedDispatcher.onBackPressed()
    }
}