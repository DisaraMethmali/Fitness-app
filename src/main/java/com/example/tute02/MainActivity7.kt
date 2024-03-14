package com.example.tute02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity7 : AppCompatActivity() {
    lateinit var myImageButton3: ImageView
    lateinit var myImageButton4: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)


        myImageButton3 = findViewById(R.id.receipe1)
        myImageButton3.setOnClickListener {
            var intent = Intent(this,MainActivity11::class.java)
            startActivity(intent)
            finish()
        }

        myImageButton4 = findViewById(R.id.hom7)
        myImageButton4.setOnClickListener {
            var intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        myImageButton4 = findViewById(R.id.pan)
        myImageButton4.setOnClickListener {
            var intent = Intent(this,MainActivity13::class.java)
            startActivity(intent)
            finish()
        }


    }
}