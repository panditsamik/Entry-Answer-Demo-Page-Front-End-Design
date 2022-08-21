package com.example.entryanswerdemopage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input : AppCompatEditText = findViewById(R.id.InputText)
        var submit : Button = findViewById(R.id.Submit)
        submit.setOnClickListener {
            if (input.text!!.isNotEmpty()){
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
