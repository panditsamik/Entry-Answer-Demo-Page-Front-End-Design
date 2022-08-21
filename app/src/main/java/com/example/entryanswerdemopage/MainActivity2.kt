package com.example.entryanswerdemopage

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var optionA : Button = findViewById(R.id.OptionA)
        var optionB : Button = findViewById(R.id.OptionB)
        var optionC : Button = findViewById(R.id.OptionC)
        var optionD : Button = findViewById(R.id.OptionD)
        var Submit : Button = findViewById(R.id.Submit)
        var count = 0
        var count1 = 0
        optionA.setOnClickListener {
            optionA.setBackgroundColor(Color.CYAN)
            count = 1
            optionA.setTypeface(null, Typeface.BOLD)
        }
        optionB.setOnClickListener {
            optionB.setBackgroundColor(Color.CYAN)
            count = 2
            optionB.setTypeface(null, Typeface.BOLD)
        }
        optionC.setOnClickListener {
            optionC.setBackgroundColor(Color.CYAN)
            count = 3
            optionC.setTypeface(null, Typeface.BOLD)
        }
        optionD.setOnClickListener {
            optionD.setBackgroundColor(Color.CYAN)
            count = 4
            optionD.setTypeface(null, Typeface.BOLD)
        }

        Submit.setOnClickListener {
            if (count1 >=1){
                val intent = Intent(this,MainActivity3::class.java)
                startActivity(intent)
                finish()
            }
            else{
                if (count == 1){
                    optionA.setBackgroundColor(Color.RED)
                    optionB.setBackgroundColor(Color.GREEN)
                }
                if (count == 2){
                    optionB.setBackgroundColor(Color.GREEN)
                }
                if (count == 3){
                    optionC.setBackgroundColor(Color.RED)
                    optionB.setBackgroundColor(Color.GREEN)
                }
                if (count == 4){
                    optionD.setBackgroundColor(Color.RED)
                    optionB.setBackgroundColor(Color.GREEN)
                }
                count1++
                if(count >= 1){
                    Submit.text = "NEXT"
                }
            }
        }
    }
}