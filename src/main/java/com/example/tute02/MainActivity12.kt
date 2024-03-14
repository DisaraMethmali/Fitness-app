package com.example.tute02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity12 : AppCompatActivity() {
    lateinit var myImageButton6: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)


        myImageButton6 = findViewById(R.id.bck12)
        myImageButton6.setOnClickListener {
            var intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }

    }
}