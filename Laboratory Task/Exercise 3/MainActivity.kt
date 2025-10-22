package com.example.mainactivity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cities = listOf("San Pedro", "Calamba", "San Pablo", "Cabuyao", "Santa Rosa")
        val city = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        val cityAdapter = ArrayAdapter(this,
            android.R.layout.simple_dropdown_item_1line, cities)
        city.setAdapter(cityAdapter)
        city.threshold = 1

        city.setOnFocusChangeListener { view, hasFocus ->
            if(hasFocus) {
                city.showDropDown()
            }

        }


        val spinnerOptions = listOf("4023", "4027", "4026", "4025", "4000")
        val options = findViewById<Spinner>(R.id.spinner)
        val spinnerAdapter = ArrayAdapter(this,
            android.R.layout.simple_spinner_item, spinnerOptions)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        options.adapter = spinnerAdapter
    }
}
