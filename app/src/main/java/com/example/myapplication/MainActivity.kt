package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayButton = findViewById<Button>(R.id.display)
        val shareButton = findViewById<Button>(R.id.share)

        displayButton.setOnClickListener {
            val displayIntent = Intent(this, MessageActivity::class.java)
            startActivity(displayIntent)
        }

        shareButton.setOnClickListener {
            // тут будет второй способ
        }
    }
}