package com.example.appcitasmednc

data class Nota(val nombre: String = "",
                val password: String = "",
                val correo: String = "") {

    override fun toString(): String{
        return (nombre + "\t" + password + "\t" + correo)
    }
}