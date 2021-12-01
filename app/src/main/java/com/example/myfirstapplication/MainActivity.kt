package com.example.myfirstapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

private const val NAME_KEY = "name"

class MainActivity : AppCompatActivity() {
    lateinit var nextActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton = findViewById(R.id.next_activity_button)
        nextActivityButton.setOnClickListener {
            // Get input text
            val filledTextField: TextInputLayout = findViewById(R.id.inputNameField)
            val inputText = filledTextField.editText?.text.toString()

            val secondActivityIntent = Intent(this, SecondActivity::class.java)
            secondActivityIntent.putExtra(NAME_KEY, inputText)
            startActivity(secondActivityIntent)
        }
    }
}