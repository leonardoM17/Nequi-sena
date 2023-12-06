package com.jdocservices.nequi

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.PopupWindow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val floatingActionButton: FloatingActionButton = findViewById(R.id.floatingActionButton)
        floatingActionButton.setOnClickListener { showPopupMenu(it) }
        val saldo = findViewById<TextView>(R.id.txtTotal)
        saldo.text = "$${AdministradorSaldo.ObtenerSaldo()}"
    }

    private fun showPopupMenu(view: View) {
        val popupMenu = PopupMenu(this, view)
        val inflater = popupMenu.menuInflater
        inflater.inflate(R.menu.menu_floating, popupMenu.menu)

        val Servicios: Button = findViewById(R.id.btnServicios)
        val Inicio: Button = findViewById(R.id.btnInicio)
        val Movimientos: Button = findViewById(R.id.btnMovimientos)

        Servicios.setOnClickListener {
            val intent = Intent(this, servicios::class.java)
            startActivity(intent)
        }
        Inicio.setOnClickListener {
            val intent = Intent(this, Inicio::class.java)
            startActivity(intent)
        }
        Movimientos.setOnClickListener {
            val intent = Intent(this, movimientos::class.java)
            startActivity(intent)
        }

        popupMenu.setOnMenuItemClickListener { item: MenuItem ->
            when (item.itemId) {
                R.id.action_option1 -> {
                    // Acción para la opción 1
                    val intent = Intent(this, servicios::class.java)
                    startActivity(intent)
                    true
                }
                R.id.action_option2 -> {
                    // Acción para la opción 2
                    val intent = Intent(this, saca::class.java)
                    startActivity(intent)
                    true
                }
                R.id.action_option3 -> {
                    // Acción para la opción 3
                    val intent = Intent(this, recargar::class.java)
                    startActivity(intent)
                    true
                }
                R.id.action_option4 -> {
                    // Acción para la opción 4
                    val intent = Intent(this, enviar::class.java)
                    startActivity(intent)
                    true
                }
                R.id.action_option5 -> {
                    // Acción para la opción 5
                    val intent = Intent(this, recargar::class.java)
                    startActivity(intent)
                    true
                }
                R.id.action_option6 -> {
                    // Acción para la opción 6
                    val intent = Intent(this, recargar::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        popupMenu.show()
    }

    override fun onResume() {
        super.onResume()
        val saldo = findViewById<TextView>(R.id.txtTotal)
        saldo.text = "$${AdministradorSaldo.ObtenerSaldo()}"
    }
}
