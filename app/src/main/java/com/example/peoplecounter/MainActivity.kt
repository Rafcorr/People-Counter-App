package com.example.peoplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val addButton = findViewById<Button>(R.id.add_btn)
        val removeButton = findViewById<Button>(R.id.remove_btn)

        var timesClicked = 0

        addButton.setOnClickListener {
            timesClicked++
            textView.text = timesClicked.toString()
        }

        removeButton.setOnClickListener {
            timesClicked--
            textView.text = timesClicked.toString()
        }
    }
}