package com.example.segundoparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Animal1Terrestre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal1_terrestre)
    }

    fun btn_siguiente(Vista: View){
        var ventana:Intent = Intent(applicationContext,Animal2terrestre::class.java)
        startActivity(ventana)
    }
}