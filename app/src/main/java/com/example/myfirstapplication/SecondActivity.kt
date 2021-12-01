package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private const val NAME_KEY = "name"

class SecondActivity : AppCompatActivity() {

    lateinit var helloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        helloTextView = findViewById(R.id.hello_text_view)

        var nameValue: String? = intent.extras?.getString(NAME_KEY)
        if (nameValue.isNullOrEmpty()) nameValue = getString(R.string.stranger)
        val helloStr = getString(R.string.hello)
        helloTextView.text = "$helloStr $nameValue"
    }
}