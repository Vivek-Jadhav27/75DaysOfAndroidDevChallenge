package com.example.day05of75

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var radioGroup: RadioGroup
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        radioGroup =findViewById(R.id.radiogrp)
        button = findViewById(R.id.btn)
        var selected =""
        radioGroup.setOnCheckedChangeListener{
            _,checkedId->
            val radioButton = findViewById<RadioButton>(checkedId)
            selected = radioButton.text.toString()
        }
        button.setOnClickListener{
            if(selected.isNotBlank()) textView.text = "You are a $selected"

        }

    }
}