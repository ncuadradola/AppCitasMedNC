package com.example.appcitasmednc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var  redireccionar: TextView
    lateinit var txtEmail: EditText
    private lateinit var txtPass: EditText
    lateinit var btnIngresar: Button

    // Creando Firebase Objeto
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonRegistro = findViewById<Button>(R.id.btnRegistro)
        botonRegistro.setOnClickListener{
            val llamaRegistroUno = Intent( this,FrmRegistro::class.java)
            startActivity(llamaRegistroUno)
        }

        val botonRecuperaP = findViewById<Button>(R.id.btnRecuperaP)
        botonRecuperaP.setOnClickListener{
            val llamaRecuperaP = Intent( this,FrmRecueprar::class.java)
            startActivity(llamaRecuperaP)
        }

        //redireccionar = findViewById(R.id.)
        btnIngresar = findViewById(R.id.btnIngresar)
        txtEmail = findViewById(R.id.txtNombreUsuario)
        txtPass = findViewById(R.id.txtContrasena)

        auth = FirebaseAuth.getInstance()

        btnIngresar.setOnClickListener {
            login()
        }
//        val botonHome = findViewById<Button>(R.id.btnIngresar)
//        botonHome.setOnClickListener{
//            val llamaHome = Intent( this,FrmHome::class.java)
//            startActivity(llamaHome)
//        }
    }

//    private fun login(){
//        val email = txtEmail.text.toString()
//        val pass = txtPass.text.toString()
//
//        auth.signInWithEmailAndPassword (email,pass).addOnCompleteListener(this){
//            if(it.isSuccessful){
//                //val botonHome = findViewById<Button>(R.id.btnIngresar)
//                //botonHome.setOnClickListener{
//                    val llamaHome = Intent( this,FrmHome::class.java)
//                    startActivity(llamaHome)
//                //}
//            }
//            else
//                Toast.makeText(this,"Algo Falló",Toast.LENGTH_LONG).show()
//        }
//    }

    private fun login(){
        val email = txtEmail.text.toString()
        val pass = txtPass.text.toString()

        println("Si entre al login")
        println(email)
        println(pass)
        try {
            auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    //val botonHome = findViewById<Button>(R.id.btnIngresar)
                    //botonHome.setOnClickListener{
                    val llamaHome = Intent(this, FrmHome::class.java)
                    startActivity(llamaHome)
                    //}
                }

            }
        }
        catch (e: Exception ){
                println(e.printStackTrace())
            Toast.makeText(this,"Estoy en el catch",Toast.LENGTH_LONG).show()
            }
        }
}