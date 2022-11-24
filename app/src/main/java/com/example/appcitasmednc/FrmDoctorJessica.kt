package com.example.appcitasmednc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FrmDoctorJessica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jessica_main)

        val botonHome = findViewById<Button>(R.id.btnSolConsultaDrJ)
        botonHome.setOnClickListener{
            val llamaHome = Intent( this,FrmHome::class.java)
            startActivity(llamaHome)
        }

        val botonmapaF = findViewById<Button>(R.id.btnUnicacionDrJ)
        botonmapaF.setOnClickListener{
            val llamaHome = Intent( this,MapsActivity::class.java)
            startActivity(llamaHome)
        }

        val botonespecialistasF = findViewById<Button>(R.id.btnEspDrJ)
        botonespecialistasF.setOnClickListener{
            val llamaHome = Intent( this,FrmFiltro::class.java)
            startActivity(llamaHome)
        }

        val botonserviciosF = findViewById<Button>(R.id.btnServicioDrJ)
        botonserviciosF.setOnClickListener{
            val llamaHome = Intent( this,FrmHome::class.java)
            startActivity(llamaHome)
        }
    }
}