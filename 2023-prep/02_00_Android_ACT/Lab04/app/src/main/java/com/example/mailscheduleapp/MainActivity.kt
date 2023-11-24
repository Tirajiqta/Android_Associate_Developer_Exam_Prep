package com.example.mailscheduleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun scheduleDelivery(view: View) {
        val intent: Intent = Intent(this, Confirm::class.java)
        val nameTextInput = findViewById<EditText>(R.id.nameTextInput).text.toString()
        val addressTextInput = findViewById<EditText>(R.id.addressTextInput).text.toString()
        val cityTextInput = findViewById<EditText>(R.id.cityTextInput).text.toString()
        val provinceTextInput = findViewById<EditText>(R.id.provinceTextInput).text.toString()
        val postalCode = findViewById<EditText>(R.id.postalCodeTextInput).text.toString()
        val country = findViewById<EditText>(R.id.countryTextInput).text.toString()

        if (nameTextInput == "" || addressTextInput == "" || cityTextInput == "" || provinceTextInput == "" || postalCode == "" || country == "") {
            android.app.AlertDialog.Builder(this).setMessage("Field can not be empty!").show()
        } else {
            intent.putExtra("name", nameTextInput)
            intent.putExtra("address", addressTextInput)
            intent.putExtra("city", cityTextInput)
            intent.putExtra("state", provinceTextInput)
            intent.putExtra("zipCode", postalCode)
            intent.putExtra("country", country)

            startActivity(intent)
        }
    }
}