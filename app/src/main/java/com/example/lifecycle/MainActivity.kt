package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Life Cycle", "OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Life Cycle", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Life Cycle", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Life Cycle", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Life Cycle", "OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Life Cycle", "OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Life Cycle", "OnDestroy")
    }
}