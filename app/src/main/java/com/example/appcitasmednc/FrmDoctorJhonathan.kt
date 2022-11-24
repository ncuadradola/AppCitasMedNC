package com.example.appcitasmednc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FrmDoctorJhonathan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jhonathan_main)

        val botonHome = findViewById<Button>(R.id.btnSolConsultaDrJh)
        botonHome.setOnClickListener{
            val llamaHome = Intent( this,FrmHome::class.java)
            startActivity(llamaHome)
        }

        val botonmapaF = findViewById<Button>(R.id.btnUnicacionDrJh)
        botonmapaF.setOnClickListener{
            val llamaHome = Intent( this,MapsActivity::class.java)
            startActivity(llamaHome)
        }

        val botonespecialistasF = findViewById<Button>(R.id.btnEspDrJh)
        botonespecialistasF.setOnClickListener{
            val llamaHome = Intent( this,FrmFiltro::class.java)
            startActivity(llamaHome)
        }

        val botonserviciosF = findViewById<Button>(R.id.btnServicioDrJh)
        botonserviciosF.setOnClickListener{
            val llamaHome = Intent( this,FrmHome::class.java)
            startActivity(llamaHome)
        }
    }
}