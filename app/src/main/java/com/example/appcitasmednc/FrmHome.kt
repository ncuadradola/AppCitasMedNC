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
            val llamaHome = Intent( this,Frmgeneral::class.java)
            startActivity(llamaHome)
        }
    }
}