package com.example.day3task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class failurePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_failure_page)

        val n = intent.getIntExtra("Anwser" , 0)
        findViewById<TextView>(R.id.textView3).text="$n"
    }
}