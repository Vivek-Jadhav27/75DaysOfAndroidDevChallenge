package com.example.day09of75

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {

    private lateinit var inputName: EditText
    private lateinit var inputPhone : EditText
    private lateinit var submitbtn : Button
    private lateinit var radioGroup: RadioGroup
    private lateinit var dancing: CheckBox
    private lateinit var singing: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputName = findViewById(R.id.inputname)
        inputPhone = findViewById(R.id.inputphone)
        submitbtn = findViewById(R.id.submit_btn)
        radioGroup = findViewById(R.id.radiogrp)
        dancing = findViewById(R.id.dance)
        singing = findViewById(R.id.sing)

        var gender = ""
        radioGroup.setOnCheckedChangeListener{
            _,checkedId ->
            val radioButton = findViewById<RadioButton>(checkedId)
            gender = radioButton.text.toString()
        }


        submitbtn.setOnClickListener{
            val name = inputName.text.toString()
            val phone = inputPhone.text.toString()
            var hobbies = ""
            if (dancing.isChecked) hobbies += " Dancing "
            if (singing.isChecked) hobbies += " Singing "

            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("name",name)
            intent.putExtra("phone",phone)
            intent.putExtra("gender",gender)
            intent.putExtra("hobbies",hobbies)
            startActivity(intent)
        }

    }
}