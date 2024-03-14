package com.example.tute02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity10 : AppCompatActivity() {
    lateinit var button3: Button
    lateinit var myImageButton3: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)
        button3 = findViewById(R.id.register1);
        button3.setOnClickListener {
            var intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        myImageButton3 = findViewById(R.id.backb)
        myImageButton3.setOnClickListener {
            var intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }

    }
}