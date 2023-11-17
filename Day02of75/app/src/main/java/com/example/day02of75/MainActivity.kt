package com.example.day02of75

import android.graphics.Rect
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private  lateinit var  textView: TextView
    private lateinit var  editText: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        editText = findViewById(R.id.editTextView)
        button = findViewById(R.id.button)

        val rootView : View = findViewById(android.R.id.content)
        rootView.setOnTouchListener {
                view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                closeKeyboardIfOutsideEditText(editText, event)
            }
            view.performClick() // Call performClick for the touch event
            false // Allow the event to continue propagating
        }

        button.setOnClickListener{
            val name : String = editText.text.toString()
            val new = "Welcome $name ,\n to the 75-Day Android App Development Challenge"
            textView.text = new
            editText.text = null
        }

    }

    private fun closeKeyboardIfOutsideEditText(etext: EditText, event: MotionEvent?) {
        if (etext.isFocused) {
            val outRect = Rect()
            etext.getGlobalVisibleRect(outRect)
            if (!outRect.contains(event!!.rawX.toInt(), event.rawY.toInt())) {
                // The touch was outside the EditText; close the keyboard
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(etext.windowToken, 0)
            }
        }
    }


}