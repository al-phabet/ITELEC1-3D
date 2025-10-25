package com.example.mainactivity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchWork = findViewById<SwitchCompat>(R.id.switchWork)
        val switchExercise = findViewById<SwitchCompat>(R.id.switchExercise)
        val switchPresentation = findViewById<SwitchCompat>(R.id.switch_presentation)
        val switchDinnerDate = findViewById<SwitchCompat>(R.id.switch_dinnerdate)


        switchWork.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, "Work Alarm: ${if (isChecked) "ON" else "OFF"}", Toast.LENGTH_SHORT).show()
        }

        switchExercise.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, "Exercise Alarm: ${if (isChecked) "ON" else "OFF"}", Toast.LENGTH_SHORT).show()
        }

        switchPresentation.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, "Presentation Alarm: ${if (isChecked) "ON" else "OFF"}", Toast.LENGTH_SHORT).show()
        }

        switchDinnerDate.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, "Dinner date Alarm: ${if (isChecked) "ON" else "OFF"}", Toast.LENGTH_SHORT).show()
        }

    }
}

