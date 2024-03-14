package com.example.tute02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity13 : AppCompatActivity() {
    lateinit var myImageButton6: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)

        myImageButton6 = findViewById(R.id.backb12)
        myImageButton6.setOnClickListener {
            var intent = Intent(this,MainActivity7::class.java)
            startActivity(intent)
            finish()
        }
    }
}