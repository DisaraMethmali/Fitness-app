package com.example.tute02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity5 : AppCompatActivity() {
    lateinit var myImageButton: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)


        myImageButton = findViewById(R.id.hom1)
       myImageButton.setOnClickListener {
            var intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
    }


}