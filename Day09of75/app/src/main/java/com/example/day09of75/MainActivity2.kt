package com.example.day09of75

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var name:TextView
    private lateinit var phone :TextView
    private lateinit var gender:TextView
    private lateinit var hobbies:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        name = findViewById(R.id.name)
        phone = findViewById(R.id.phone)
        gender = findViewById(R.id.gender)
        hobbies = findViewById(R.id.hobbies)

        val intent = intent.extras
        name.text = intent?.getString("name").toString()
        phone.text = intent?.getString("phone").toString()
        gender.text = intent?.getString("gender").toString()
        hobbies.text = intent?.getString("hobbies").toString()

    }
}