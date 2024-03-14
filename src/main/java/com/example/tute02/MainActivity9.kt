package com.example.tute02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var myImageButton11: ImageView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)


        myImageButton11 = findViewById(R.id.bck9)
        myImageButton11.setOnClickListener {
            var intent = Intent(this,MainActivity8::class.java)
            startActivity(intent)
            finish()
        }


    }
}