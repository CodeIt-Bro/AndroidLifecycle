package com.example.lenovo.androidlifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Function Reaching Log","App reached onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Function Reaching Log","App reached onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Function Reaching Log","App reached onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Function Reaching Log","App reached onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Function Reaching Log","App reached onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Function Reaching Log","App reached onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Function Reaching Log","App reached onRestart")
    }
}
