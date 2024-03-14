package com.example.tute02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {

    lateinit var button3: Button
    lateinit var button4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button3 = findViewById(R.id.login);
        button3.setOnClickListener {
            var intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        button4 = findViewById(R.id.reg);
        button4.setOnClickListener {
            var intent = Intent(this,MainActivity10::class.java)
            startActivity(intent)
            finish()
        }
    }
}