package com.example.appcitasmednc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FrmFiltro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.filtro_main)

        val botonmapaF = findViewById<Button>(R.id.btnUbicacionF)
        botonmapaF.setOnClickListener{
            val llamaHome = Intent( this,FrmMaps::class.java)
            startActivity(llamaHome)
        }

        val botonespecialistasF = findViewById<Button>(R.id.btnEspecialistasF)
        botonespecialistasF.setOnClickListener{
            val llamaHome = Intent( this,FrmFiltro::class.java)
            startActivity(llamaHome)
        }

        val botonserviciosF = findViewById<Button>(R.id.btnServiciosF)
        botonserviciosF.setOnClickListener{
            val llamaHome = Intent( this,FrmHome::class.java)
            startActivity(llamaHome)
        }

        val botonsalirF = findViewById<Button>(R.id.btnSalirF)
        botonsalirF.setOnClickListener{
            val llamaHome = Intent( this,MainActivity::class.java)
            startActivity(llamaHome)
        }

        val botonDoctorF = findViewById<Button>(R.id.btnDoctorF)
        botonDoctorF.setOnClickListener{
            val llamaHome = Intent( this,FrmDoctor::class.java)
            startActivity(llamaHome)
        }
    }
}
