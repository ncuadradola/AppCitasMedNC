package com.example.appcitasmednc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonRegistro = findViewById<Button>(R.id.btnRegistro)
        botonRegistro.setOnClickListener{
            val llamaRegistroUno = Intent( this,FrmRegistro::class.java)
            startActivity(llamaRegistroUno)
        }

        val botonRecuperaP = findViewById<Button>(R.id.btnRecuperaP)
        botonRecuperaP.setOnClickListener{
            val llamaRecuperaP = Intent( this,FrmRecueprar::class.java)
            startActivity(llamaRecuperaP)
        }

        val botonHome = findViewById<Button>(R.id.btnIngresar)
        botonHome.setOnClickListener{
            val llamaHome = Intent( this,FrmHome::class.java)
            startActivity(llamaHome)
        }

    }
}