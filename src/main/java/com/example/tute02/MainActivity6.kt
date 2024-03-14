package com.example.tute02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity6 : AppCompatActivity() {
    lateinit var myImageButton1: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)


        myImageButton1 = findViewById(R.id.hom5)
        myImageButton1.setOnClickListener {
            var intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
    }
}