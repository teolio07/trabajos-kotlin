package com.example.usodeestados
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("ciclo", "ingrese al onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo", "ingrese a onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo", "ingrese a onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo", "ingrese a onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo", "ingrese a onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo", "ingrese a onDestroy()")
    }
}