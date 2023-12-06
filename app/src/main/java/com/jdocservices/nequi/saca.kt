package com.jdocservices.nequi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class saca : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saca)
        val volver: Button = findViewById(R.id.btnVolverS)
        val randomCodeTextView = findViewById<TextView>(R.id.randomCodeTextView)

        // Generar el código aleatorio al iniciar la actividad
        val randomCode = generateRandomCode()
        randomCodeTextView.text = "$randomCode"

        volver.setOnClickListener {
            val intent = Intent(this, Inicio::class.java)
            startActivity(intent)
        }
    }

    fun generateRandomCode(): String {
        val random = Random(System.currentTimeMillis())
        val code = random.nextInt(1000, 10000) // Genera un número aleatorio entre 1000 y 9999 (4 dígitos)
        return code.toString()
    }
}

