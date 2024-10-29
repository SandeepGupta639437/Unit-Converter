package com.example.t5_sandeep_2312067

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CelciusToKelvin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_celcius_to_kelvin)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homeButton: Button = findViewById<Button>(R.id.Home_Button)

        homeButton.setOnClickListener{
            val intent = Intent(this@CelciusToKelvin , MainActivity::class.java)
            startActivity(intent)
        }
        val edt : EditText = findViewById<EditText>(R.id.CelciusText)
        val btn : Button = findViewById<Button>(R.id.buttoncelciustokelvin)
        val resultText: TextView = findViewById<TextView>(R.id.KelvinResult)

        btn.setOnClickListener(){
            val Celcius : Double = edt.text.toString().toDouble()

            resultText.setText("" + converttoKelvin(Celcius) + " " + "Kelvin")
        }
    }
    fun converttoKelvin(Celcius : Double): Double{
        var kelvin = Celcius + 273

        return kelvin
    }
}