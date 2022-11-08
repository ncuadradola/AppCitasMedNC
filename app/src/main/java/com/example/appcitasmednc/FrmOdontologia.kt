package com.example.appcitasmednc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FrmOdontologia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.odontologia_main)

        val botonDrOne = findViewById<Button>(R.id.btnDocOne)
        botonDrOne.setOnClickListener{
            val llamaHome = Intent( this,FrmDoctor::class.java)
            startActivity(llamaHome)
        }


    }
}