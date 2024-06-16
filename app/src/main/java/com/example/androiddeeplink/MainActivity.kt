package com.example.androiddeeplink

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
   private lateinit var msgTV: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        msgTV = findViewById(R.id.idTVMsg)

        val uri: Uri? = intent.data
        Log.e("Param",""+uri)
        if (uri != null) {
            val parameters: List<String> = uri.pathSegments

            // after that we are extracting string from that parameters.
            val param = parameters[parameters.size - 1]

            // on below line we are setting
            // that string to our text view
            // which we got as params.
            msgTV.text = param


            Log.e("Param",""+param+parameters)
        }
    }
}