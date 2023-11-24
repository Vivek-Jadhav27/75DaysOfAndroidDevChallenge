package com.example.day08of75

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn_impl : Button
    private lateinit var btn_expl : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_expl = findViewById(R.id.explicit)
        btn_impl = findViewById(R.id.implicit)

        btn_expl.setOnClickListener{
            val explicit = Intent(this,MainActivity2::class.java)
            startActivity(explicit)
        }
        btn_impl.setOnClickListener{
            val url = "https://github.com/Vivek-Jadhav27/75DaysOfAndroidDevChallenge"
            val implicit = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(implicit)
        }

    }
}