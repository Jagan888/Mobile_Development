package com.example.day3task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class successPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success_page)

        val n = intent.getIntExtra("Anwser" , 0)
        findViewById<TextView>(R.id.textView).text="$n"

    }
}


/*private fun Intent.getIntExtra(s: String): Int {

}*/
