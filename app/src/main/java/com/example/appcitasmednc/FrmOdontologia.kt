package com.example.appcitasmednc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FrmOdontologia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.odontologia_main)

        val botonDocOne = findViewById<Button>(R.id.btnDrOneO)
        botonDocOne.setOnClickListener{
            val llamaDoc = Intent( this,FrmDoctor::class.java)
            startActivity(llamaDoc)
        }

        val botonGral = findViewById<Button>(R.id.btnInicioO)
        botonGral.setOnClickListener{
            val llamahome = Intent( this,FrmHome::class.java)
            startActivity(llamahome)
        }

        val botonubiG = findViewById<Button>(R.id.btnUbicacionO)
        botonubiG.setOnClickListener{
            val llamaUbica = Intent( this,MapsActivity::class.java)
            startActivity(llamaUbica)
        }

        val botonServG = findViewById<Button>(R.id.btnServiciosO)
        botonServG.setOnClickListener{
            val llamaServ = Intent( this,FrmHome::class.java)
            startActivity(llamaServ)
        }

        val botonFiltroG = findViewById<Button>(R.id.btnEspecialistasO)
        botonFiltroG.setOnClickListener{
            val llamaServ = Intent( this,FrmFiltro::class.java)
            startActivity(llamaServ)
        }
    }
}