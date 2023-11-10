package com.example.lesson05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClicked(view: View) {
        if (findViewById<CheckBox>(R.id.usaCheckBox).isChecked) {
            findViewById<TextView>(R.id.answerText).text =
                getString(R.string.english_speaking_countries_answer_result_1)
        } else if (findViewById<CheckBox>(R.id.canadaCheckBox).isChecked) {
            findViewById<TextView>(R.id.answerText).text =
                getString(R.string.english_speaking_countries_answer_result_2)
        } else if (findViewById<CheckBox>(R.id.chinaCheckBox).isChecked) {
            findViewById<TextView>(R.id.answerText).text =
                getString(R.string.english_speaking_countries_answer_result_3)
        }
    }
    fun onSelect(view: View){
        if(findViewById<RadioButton>(R.id.radioYes).isChecked){
            findViewById<TextView>(R.id.isPersonCertifiedAnswer).text = getString(R.string.person_is_certified)
        }else if(findViewById<RadioButton>(R.id.radioNo).isChecked){
            findViewById<TextView>(R.id.isPersonCertifiedAnswer).text = getString(R.string.person_is_not_certified)
        }
    }
}