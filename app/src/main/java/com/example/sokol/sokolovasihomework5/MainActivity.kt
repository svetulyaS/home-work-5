package com.example.sokol.sokolovasihomework5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Ты видел деву на скале")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "В одежде белой над волнами")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Когда, бушуя в бурной мгле,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Ее всечасно блеском алым")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "И ветер бился и летал")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart?")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}