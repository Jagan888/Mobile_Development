package com.example.firstdemoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.collections.mapOf


class MainActivity : AppCompatActivity() {

    var RedColor="Red"
    var BlueColor="Blue"
    var GreenColor="Green"
    val nameMap = mutableMapOf<String,Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickColorDisplayView=findViewById<TextView>(R.id.clickCountView)
        val clickRedButton=findViewById<TextView>(R.id.clickRed)
        val clickGreenButton=findViewById<TextView>(R.id.clickGreen)
        val clickBlueButton=findViewById<TextView>(R.id.clickBlue)
        val clickMe=findViewById<TextView>(R.id.clickme)
        val userInputName=findViewById<TextInputLayout>(R.id.Uid)

        clickMe.setOnClickListener {
            val username = userInputName.editText?.text?.toString()

            val maskedUsername =
                if (username.isNullOrEmpty()) " Nobody"
            else  username


            val oldClickValue = nameMap[maskedUsername] ?:0
            val newClickValue = oldClickValue+1
            nameMap[maskedUsername] = newClickValue
            clickColorDisplayView.text=" $maskedUsername clicked $newClickValue times"

        }
        clickRedButton.setOnClickListener {

            clickColorDisplayView.text=" $RedColor color"
        }


        clickGreenButton.setOnClickListener {
            clickColorDisplayView.text=" $GreenColor color"
        }

        clickBlueButton.setOnClickListener {
            clickColorDisplayView.text=" $BlueColor color"
        }

    }
    }
