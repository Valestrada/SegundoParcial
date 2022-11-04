package com.example.segundoparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_terrestre.setOnClickListener{
            val intent = Intent(this,Animal1Terrestre::class.java)
            startActivity(intent);
        }
        card_terrestre.setOnClickListener{
            val intent = Intent(this,Animal2terrestre::class.java)
            startActivity(intent);
        }
    }
}