package com.example.recuperaciondesarrollointerfaces1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var boton1:Button
    private lateinit var fondo:View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton1 = findViewById(R.id.button)
        fondo = findViewById(R.id.view1)

        boton1.setOnClickListener {
            fondo.setBackgroundColor(2)
        }
    }
}