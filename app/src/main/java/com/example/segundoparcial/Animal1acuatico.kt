package com.example.segundoparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Animal1acuatico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal1acuatico)
    }
    fun btn_siguiente2(Vista: View){
        var ventana: Intent = Intent(applicationContext,Animal2acuatico::class.java)
        startActivity(ventana)
    }
}