package com.jdocservices.nequi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class enviar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enviar)

        val volver: Button = findViewById(R.id.btnAtrasEnvia)
        val btnEnviar: Button = findViewById(R.id.btnEnviarSaldo)
        var saldo = findViewById<TextView>(R.id.saldoEnviar)


        btnEnviar.setOnClickListener {
            if (AdministradorSaldo.ObtenerSaldo() - saldo.text.toString().toDouble() < 0){
                Toast.makeText(this,"Saldo insuficiente",Toast.LENGTH_SHORT).show()
            }else{
                AdministradorSaldo.restarSaldo(saldo.text.toString().toDouble())
                finish()
            }
        }

        volver.setOnClickListener {
            val intent = Intent(this, Inicio::class.java)
            startActivity(intent)
        }






























    }
}