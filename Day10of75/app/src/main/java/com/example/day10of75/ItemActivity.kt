package com.example.day10of75

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)
        val textView : TextView = findViewById(R.id.itemTextView)
        textView.text = intent.getStringExtra("Title")
    }
}