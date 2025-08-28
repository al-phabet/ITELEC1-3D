package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private val tag = "ActivityLifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate: Activity is being created.")
    }

    override fun onStart (){
        super.onStart()
        showMessage("onStart: Activity is becoming visible.")
    }

    override fun onResume (){
        super.onResume()
        showMessage("onResume: Activity is now interactive.")
    }

    override fun onPause(){
        super.onPause()
        showMessage("onPause: Activity is pausing.")
    }

    override fun onStop(){
        super.onStop()
        showMessage("onStop: Activity is no longer visible.")
    }


    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy: Activity is being destroyed.")
    }


    private fun showMessage(method: String) {
        Log.d(tag,"$method called")
        Toast.makeText(this, "$method called", Toast.LENGTH_SHORT).show()
    }
}


