package com.example.appcitasmednc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Frmgeneral : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.general_main)

        val botonDocOne = findViewById<Button>(R.id.btnDocOne)
        botonDocOne.setOnClickListener{
            val llamaHome = Intent( this,FrmDoctor::class.java)
            startActivity(llamaHome)
        }
    }
}