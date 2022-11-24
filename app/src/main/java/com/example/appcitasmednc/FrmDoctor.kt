package com.example.appcitasmednc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FrmDoctor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.doctor_main)

        val botonHome = findViewById<Button>(R.id.btnSolConsulta)
        botonHome.setOnClickListener{
            val llamaHome = Intent( this,FrmHome::class.java)
            startActivity(llamaHome)
        }

        val botonmapaF = findViewById<Button>(R.id.btnUnicacionDr)
        botonmapaF.setOnClickListener{
            val llamaHome = Intent( this,MapsActivity::class.java)
            startActivity(llamaHome)
        }

        val botonespecialistasF = findViewById<Button>(R.id.btnEspDr)
        botonespecialistasF.setOnClickListener{
            val llamaHome = Intent( this,FrmFiltro::class.java)
            startActivity(llamaHome)
        }

        val botonserviciosF = findViewById<Button>(R.id.btnServicioDr)
        botonserviciosF.setOnClickListener{
            val llamaHome = Intent( this,FrmHome::class.java)
            startActivity(llamaHome)
        }
    }
}