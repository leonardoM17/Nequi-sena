package com.jdocservices.nequi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo2)

        val ingresoUsuario: EditText = findViewById(R.id.txtIngresoUsuario)
        val btnIngresoUsuario: Button = findViewById(R.id.btnIngresar)

        btnIngresoUsuario.setOnClickListener {
            if (ingresoUsuario.text.toString() == "1234"){
                val logueo = Intent(this,Inicio::class.java)
                logueo.putExtra("clave",ingresoUsuario.text.toString())
                startActivity(logueo)
            }else{
                Toast.makeText(this, "Clave incorrecta intenta nuevamente", Toast.LENGTH_SHORT).show()
            }
            ingresoUsuario.setText("")

        }
    }
}