package com.example.tute02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity4 : AppCompatActivity() {

    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var button6: Button
    lateinit var button7: Button
    lateinit var myImageButton3: ImageView
    lateinit var myImageButton4: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        button4 = findViewById(R.id.scan);
        button4.setOnClickListener {
            var intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)
            finish()
        }

        button5 = findViewById(R.id.fast);
        button5.setOnClickListener {
            var intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)
            finish()
        }
        button5 = findViewById(R.id.recepie);
        button5.setOnClickListener {
            var intent = Intent(this,MainActivity7::class.java)
            startActivity(intent)
            finish()
        }
        button4 = findViewById(R.id.diet);
        button4.setOnClickListener {
            var intent = Intent(this,MainActivity8::class.java)
            startActivity(intent)
            finish()
        }

        myImageButton3 = findViewById(R.id.bck2)
        myImageButton3.setOnClickListener {
            var intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        myImageButton4 = findViewById(R.id.dp)
        myImageButton4.setOnClickListener {
            var intent = Intent(this,MainActivity12::class.java)
            startActivity(intent)
            finish()
        }

    }
}