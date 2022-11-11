package com.example.laboratorio2_cq0781012020

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var etnname: EditText
    lateinit var etnedad: EditText
    lateinit var etndepto: EditText
    private var tvresultado: TextView? = null






    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etnname = findViewById(R.id.etndepto)
        etnedad= findViewById(R.id.etndepto)
        etndepto = findViewById(R.id.etndepto)
        tvresultado = findViewById(R.id.tvresultado)

    }
     fun ingresar(Vista: View){

         val name = etnname.text.toString()
         val edad = etnedad.text.toString()
         val depto = etndepto.toString()


         if (name.length == 0) {
             Toast.makeText(this, "Ingresar nombre", Toast.LENGTH_LONG).show()
         }
         if (edad.length == 0) {
             Toast.makeText(this, "Ingresar edad", Toast.LENGTH_LONG).show()
         }
         if (depto.length == 0) {
             Toast.makeText(this, "Ingresar departamento", Toast.LENGTH_LONG).show()
         }
         if (name.length != 0 && edad.length != 0 && depto.length != 0) {
             Toast.makeText(this, "Registro en proceso...", Toast.LENGTH_LONG).show()
         }

         tvresultado?.text = ("Su nombre es" + name + "de" + edad + "del departamento " + depto)
     }
}