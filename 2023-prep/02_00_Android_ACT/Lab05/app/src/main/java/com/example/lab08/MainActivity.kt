package com.example.lab08

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pizzaSize = arrayListOf("Select", "Small", "Medium", "Large", "Extra large")
        val slider: SeekBar = findViewById(R.id.mySeekBar)
        val value: TextView = findViewById(R.id.pizza_size)
        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                value.text = pizzaSize[progress]
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

        findViewById<Button>(R.id.dateBtn).setOnClickListener {
            DatePickerDialog(
                this,
                { _, Year, Month, Day ->
                    findViewById<TextView>(R.id.datePickerText).text = "$Day/${Month + 1}/$Year"
                },
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            ).show()
        }
        findViewById<Button>(R.id.timeBtn).setOnClickListener {
            TimePickerDialog(this, {
                _, hour, minute -> findViewById<TextView>(R.id.timeText).text = "$hour-$minute"
            }, Calendar.getInstance().get(Calendar.HOUR_OF_DAY), Calendar.getInstance().get(Calendar.MINUTE), true).show()

        }
        findViewById<Button>(R.id.scheduleBtn).setOnClickListener {
//          TODO: add validation if not empty + phone number validations
            val intent = Intent(this, ThanksActivity::class.java)
            intent.putExtra("name", findViewById<EditText>(R.id.name_input_id).text.toString())
            intent.putExtra("phoneNumber", findViewById<EditText>(R.id.phoneNumber_input_id).text.toString())
            intent.putExtra("pizzaSize", findViewById<TextView>(R.id.pizza_size).text.toString())
            intent.putExtra("date", findViewById<TextView>(R.id.datePickerText).text.toString())
            intent.putExtra("time", findViewById<TextView>(R.id.timeText).text.toString())
            startActivity(intent)
        }
    }
}