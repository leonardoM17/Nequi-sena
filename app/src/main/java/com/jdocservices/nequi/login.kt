package com.jdocservices.nequi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val inputN:EditText = findViewById(R.id.txtNumero)
        val entrar:Button = findViewById(R.id.btnEntrar)

        entrar.setOnClickListener {
            if (inputN.text.toString() != ""){
                val lg = Intent(this,login2::class.java)
                lg.putExtra("clave",inputN.text.toString())
                startActivity(lg)
            }else{
                Toast.makeText(this, "Ingresa su numero por favor", Toast.LENGTH_SHORT).show()
            }
            inputN.setText("")

        }

    }
}