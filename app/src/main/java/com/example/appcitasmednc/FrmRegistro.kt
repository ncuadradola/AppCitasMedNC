package com.example.appcitasmednc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class FrmRegistro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_main)

        val botonISesion = findViewById<Button>(R.id.btnInicisioSe)

        botonISesion.setOnClickListener {
            val llamaISesion = Intent(this, MainActivity::class.java)
            startActivity(llamaISesion)
        }
    }
}
