package com.example.lab06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun display(view: View) {
        if (findViewById<TextView>(R.id.courses).isPressed) {
            findViewById<TextView>(R.id.info_courses).text = getString(R.string.info_courses)
        }
        if (findViewById<TextView>(R.id.exams).isPressed) {
            findViewById<TextView>(R.id.info_exams).text = getString(R.string.info_exams)
        }
        if (findViewById<TextView>(R.id.freelance).isPressed) {
            findViewById<TextView>(R.id.freelance).text = getString(R.string.info_freelance)
        }
    }

}