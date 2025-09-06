package com.example.lab_week_02_a

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG, "OnStart")
    }

    override fun onRestart(){
        super.onRestart()
        Log.d(TAG, "OnRestart")
    }

    override fun onResume(){
        super.onResume()
        Log.d(TAG, "OnResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG, "OnPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d(TAG, "OnStop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG, "OnDestroy")
    }

}