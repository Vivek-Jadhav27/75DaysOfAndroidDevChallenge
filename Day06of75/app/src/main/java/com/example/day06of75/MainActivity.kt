package com.example.day06of75

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var cbenglish : CheckBox
    private lateinit var cbhindi : CheckBox
    private lateinit var cbmarathi : CheckBox
    private lateinit var cbgujarati : CheckBox
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        cbenglish = findViewById(R.id.english)
        cbhindi = findViewById(R.id.hindi)
        cbgujarati = findViewById(R.id.gujarati)
        cbmarathi = findViewById(R.id.marathi)
        button = findViewById(R.id.button)

        button.setOnClickListener{
            var sel = "Selected prefered languages :"
            if (cbenglish.isChecked) sel += " English "
            if (cbgujarati.isChecked) sel += " Gujarati "
            if (cbhindi.isChecked) sel += " Hindi "
            if (cbmarathi.isChecked) sel += " Marathi "

            textView.text = sel
        }
    }
}