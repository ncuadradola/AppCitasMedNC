package com.example.appcitasmednc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Frmgeneral : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.general_main)

        val botonDocOne = findViewById<Button>(R.id.btnDocOneG)
        botonDocOne.setOnClickListener{
            val llamaDoc = Intent( this,FrmDoctor::class.java)
            startActivity(llamaDoc)
        }

        val botonGral = findViewById<Button>(R.id.btnInicioG)
        botonGral.setOnClickListener{
            val llamahome = Intent( this,FrmHome::class.java)
            startActivity(llamahome)
        }

        val botonubiG = findViewById<Button>(R.id.btnUbicacionG)
        botonubiG.setOnClickListener{
            val llamaUbica = Intent( this,FrmMaps::class.java)
            startActivity(llamaUbica)
        }

        val botonServG = findViewById<Button>(R.id.btnServiciosG)
        botonServG.setOnClickListener{
            val llamaServ = Intent( this,FrmHome::class.java)
            startActivity(llamaServ)
        }

        val botonFiltroG = findViewById<Button>(R.id.btnEspecialistasG)
        botonFiltroG.setOnClickListener{
            val llamaServ = Intent( this,FrmFiltro::class.java)
            startActivity(llamaServ)
        }
    }
}