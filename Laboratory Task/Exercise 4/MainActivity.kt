package com.example.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStandard = findViewById<Button>(R.id.buttonStandard)
        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)

        // Standard Button
        buttonStandard.setOnClickListener {
            Toast.makeText(this, "Standard Button Clicked!", Toast.LENGTH_SHORT).show()
        }

        // Image Button
        imageButton.setOnClickListener {
            Toast.makeText(this, "Image Button Pressed!", Toast.LENGTH_SHORT).show()
        }

        // Toggle Button
        toggleButton.setOnClickListener {
            if (toggleButton.isChecked) {
                Toast.makeText(this, "Toggle is ON", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Toggle is OFF", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
