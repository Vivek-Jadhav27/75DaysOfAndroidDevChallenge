package com.example.day04of75

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var  textView: TextView
    private lateinit var  button: Button
    private lateinit var  spinner: Spinner
    private lateinit var selectedLanguage : String
    private val languageList = arrayListOf(
        "Select Language",
        "Kotlin",
        "Java",
        "C",
        "Python",
        "Dart"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        spinner = findViewById(R.id.spinner)
        button = findViewById(R.id.btn_submit)
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,languageList)
        spinner.onItemSelectedListener = object : OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, p3: Long) {
                if(position !=0){
                    selectedLanguage = languageList[position]
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        button.setOnClickListener{
            textView.text = "Selected language : $selectedLanguage"
        }
    }
}