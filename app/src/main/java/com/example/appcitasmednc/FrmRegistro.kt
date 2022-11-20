package com.example.appcitasmednc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
//import com.google.firebase.*
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class FrmRegistro : AppCompatActivity() {
    private val marksRef = FirebaseDatabase.getInstance().getReference("marks")
    //private val db = FirebaseFirestore.getInstance()
    //val marksRef = Firebase.database
    //val myRef = database.getReference("message")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_main)

        val botonISesion = findViewById<Button>(R.id.btnInicisioSe)

        botonISesion.setOnClickListener {
            val llamaISesion = Intent(this, MainActivity::class.java)
            startActivity(llamaISesion)
        }

        val save_button = findViewById<Button>(R.id.btnGuardar)
        save_button.setOnClickListener { saveMarkFromForm() }

        marksRef.addChildEventListener(object : ChildEventListener {
            override fun onCancelled(databaseError: DatabaseError) {}
            override fun onChildMoved(dataSnapshot: DataSnapshot, previousName: String?) {}
            override fun onChildChanged(dataSnapshot: DataSnapshot, previousName: String?) {}
            override fun onChildRemoved(dataSnapshot: DataSnapshot) {}

            override fun onChildAdded(dataSnapshot: DataSnapshot, p1: String?) {
                val nota = dataSnapshot.getValue(Nota::class.java)
                if (nota != null) writeMark(nota)
            }
        })
    }

    private fun saveMarkFromForm() {
        val name_editText = findViewById<EditText>(R.id.txtNombreU)
        val password_editText = findViewById<EditText>(R.id.editTextTextPassword)
        val correo_editText = findViewById<EditText>(R.id.txtCorreo)

        val nota = Nota(
            name_editText.text.toString(),
            password_editText.text.toString(),
            correo_editText.text.toString()
        )
        marksRef.push().setValue(nota)//Propio de Firebase
    }

    private fun writeMark(mark: Nota) {
        val list_textView = findViewById<TextView>(R.id.list_textView)
        val text = list_textView.text.toString() + mark.toString() + "\n"
        list_textView.text = text
    }


}
