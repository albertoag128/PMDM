package com.example.pmdm.presentation.ex05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.pmdm.R

class Ut01Ex05Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01_ex05)

        setUpView()
    }

    fun setUpView(){
        val inputName = findViewById<EditText>(R.id.inputName)
        val inputSurname = findViewById<EditText>(R.id.inputSurname)
        val actionSave = findViewById<Button>(R.id.actionSave)
        val resultado = findViewById<TextView>(R.id.resultado)


        var name = inputName.text.toString()
        var surname = inputSurname.text.toString()


        actionSave.setOnClickListener {
            var person = Person(name, surname)
            Log.d("@dev", "Persona: $person")
        }

    }
}