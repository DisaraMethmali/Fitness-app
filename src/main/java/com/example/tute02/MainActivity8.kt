package com.example.tute02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var myImageButton5: ImageView
        lateinit var myImageButton6: ImageView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)


        myImageButton5 = findViewById(R.id.vegand)
        myImageButton5.setOnClickListener {
            var intent = Intent(this,MainActivity9::class.java)
            startActivity(intent)
            finish()
        }

        myImageButton6 = findViewById(R.id.hom8)
        myImageButton6.setOnClickListener {
            var intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
    }
}