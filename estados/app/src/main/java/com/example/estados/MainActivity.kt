package com.example.estados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("ciclo", "se ejecuta onCreate()")

    }
    override fun onStart() {
        super.onStart()
        Log.i("ciclo", "se ejecuta onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo", "se ejecuta onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo", "se ejecuta onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo", "se ejecuta onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo", "se ejecuta onDestroy()")
    }

}