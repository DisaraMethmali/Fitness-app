package com.example.tute02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {


    lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        button2 = findViewById(R.id.next);
        button2.setOnClickListener {
            var intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
    }


}