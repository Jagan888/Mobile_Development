package com.example.day3task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count=12
        val click=findViewById<Button>(R.id.button)
        val guess=findViewById<TextInputLayout>(R.id.userEnteredNumber)
        var view1=findViewById<TextView>(R.id.guessText)
        var view2=findViewById<TextView>(R.id.textView6)
        val num= Random.nextInt(0,100)

       // view1.text=("$num")
        click.setOnClickListener{
            val guess1=guess.editText?.text?.toString()
            try {
                if (count!=0) {
                    view1.setText("")
                    val guess2 = if (guess1.isNullOrEmpty()) 0
                    else guess1.toInt()
                    if (guess2 == num) {
                        view1.text = "You are right"
                        //findViewById<Button>(R.id.button).setOnClickListener{
                        val newScreenIntent = Intent(this, successPage::class.java).apply {
                            putExtra("Anwser", num)
                        }
                        startActivity(newScreenIntent)

                        //}
                    } else if (guess2 < num) {
                        view1.text = "No :) the number is bigger"
                        count--
                        if (count == 0) {
                            val newScreenIntent = Intent(this, failurePage::class.java).apply {
                                putExtra("Anwser", num)
                            }
                            startActivity(newScreenIntent)
                        }

                        view2.text = "You have $count attempts left"


                    } else {
                        view1.text = "No :) the number is smaller"
                        count--
                        if (count == 0) {
                            val newScreenIntent = Intent(this, failurePage::class.java).apply {
                                putExtra("Anwser", num)
                            }
                            startActivity(newScreenIntent)
                            view2.text = "You have $count attempts left"

                        }
                    }
                }
                else
                {

                        val newScreenIntent = Intent(this,failurePage::class.java).apply {
                            putExtra("Anwser",num)
                        }
                    startActivity(newScreenIntent)
                }

            }
            catch (e:Exception){
                view1.setText("Please Enter a number")
            }

            fun correctNumber():String?{
                return num.toString()
        }
        }
    }
}