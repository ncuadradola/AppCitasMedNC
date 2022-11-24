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
            val llamaMp = Intent( this,MapsActivity::class.java)
            startActivity(llamaMp)
        }

        val botonespecialistasF = findViewById<Button>(R.id.btnEspecialistasF)
        botonespecialistasF.setOnClickListener{
            val llamaEsp = Intent( this,FrmFiltro::class.java)
            startActivity(llamaEsp)
        }

        val botonserviciosF = findViewById<Button>(R.id.btnServiciosF)
        botonserviciosF.setOnClickListener{
            val llamaSrv = Intent( this,FrmHome::class.java)
            startActivity(llamaSrv)
        }

        val botonsalirF = findViewById<Button>(R.id.btnSalirF)
        botonsalirF.setOnClickListener{
            val llamasalir = Intent( this,MainActivity::class.java)
            startActivity(llamasalir)
        }

        val botonDoctorF = findViewById<Button>(R.id.btnDoctorF)
        botonDoctorF.setOnClickListener{
            val llamaDr = Intent( this,FrmDoctor::class.java)
            startActivity(llamaDr)
        }

        val botonDoctorJ = findViewById<Button>(R.id.btnDoctorJess)
        botonDoctorJ.setOnClickListener{
            val llamaJ = Intent( this,FrmDoctorJessica::class.java)
            startActivity(llamaJ)
        }

        val botonDoctorJh = findViewById<Button>(R.id.btnDoctorJho)
        botonDoctorJh.setOnClickListener{
            val llamaJh = Intent( this,FrmDoctorJhonathan::class.java)
            startActivity(llamaJh)
        }

        val botonDoctorSm = findViewById<Button>(R.id.btnDoctorSama)
        botonDoctorSm.setOnClickListener{
            val llamaSm = Intent( this,FrmDoctorSamantha::class.java)
            startActivity(llamaSm)
        }
    }
}
