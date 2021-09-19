package com.example.kts_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.mainText)
        findViewById<Button>(R.id.mainButton).setOnClickListener{
            val newText = "Bye world!"
            textView?.text = newText
        }
    }
}