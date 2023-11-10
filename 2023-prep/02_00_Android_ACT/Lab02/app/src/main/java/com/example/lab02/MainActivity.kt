package com.example.lab02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun placeOrder(view: View) {
        var pizzaSizePrice = 0.0
        var toppings = 0.0
        when {
            findViewById<RadioButton>(R.id.smallPizza).isChecked -> pizzaSizePrice = 5.0
            findViewById<RadioButton>(R.id.mediumPizza).isChecked -> pizzaSizePrice = 7.0
            findViewById<RadioButton>(R.id.largePizza).isChecked -> pizzaSizePrice = 9.0
        }

        if (findViewById<CheckBox>(R.id.onionsCheckBox).isChecked) toppings += 1
        if (findViewById<CheckBox>(R.id.olivesCheckBox).isChecked) toppings += 2
        if (findViewById<CheckBox>(R.id.tomatoesCheckBox).isChecked) toppings += 3

        findViewById<TextView>(R.id.order).text =
            getString(R.string.total_order_price_placeholder, pizzaSizePrice + toppings)
    }
}