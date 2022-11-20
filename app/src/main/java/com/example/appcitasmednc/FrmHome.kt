package com.example.appcitasmednc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FrmHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_main)

        val botonGral = findViewById<Button>(R.id.btnGeneral)
        botonGral.setOnClickListener{
            val llamageneral = Intent( this,Frmgeneral::class.java)
            startActivity(llamageneral)
        }

        val botonmapa = findViewById<Button>(R.id.btnUbicacion)
        botonmapa.setOnClickListener{
            val llamamapas = Intent( this,MapsActivity::class.java)
            startActivity(llamamapas)
        }

        val botonespecialistas = findViewById<Button>(R.id.btnEspecialistas)
        botonespecialistas.setOnClickListener{
            val llamaespe = Intent( this,FrmFiltro::class.java)
            startActivity(llamaespe)
        }

        val botonservicios = findViewById<Button>(R.id.btnServicios)
        botonservicios.setOnClickListener{
            val llamasrv = Intent( this,FrmHome::class.java)
            startActivity(llamasrv)
        }

        val botonsalir = findViewById<Button>(R.id.btnSalirH)
        botonsalir.setOnClickListener{
            val llamasalir = Intent( this,MainActivity::class.java)
            startActivity(llamasalir)
        }

        val botonOdont = findViewById<Button>(R.id.btnOdontologiaH)
        botonOdont.setOnClickListener{
            val llamaOdont = Intent( this,FrmOdontologia::class.java)
            startActivity(llamaOdont)
        }
    }
}

