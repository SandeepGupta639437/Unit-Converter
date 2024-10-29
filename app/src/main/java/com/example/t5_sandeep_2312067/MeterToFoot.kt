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

class MeterToFoot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_meter_to_foot)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homeButton: Button = findViewById<Button>(R.id.Home_Button)

        homeButton.setOnClickListener{
            val intent = Intent(this@MeterToFoot , MainActivity::class.java)
            startActivity(intent)
        }
        val edt : EditText = findViewById<EditText>(R.id.MeterText)
        val btn : Button = findViewById<Button>(R.id.buttonmetertofoot)
        val resultText: TextView = findViewById<TextView>(R.id.FootResult)
        btn.setOnClickListener(){
            val Meter : Double = edt.text.toString().toDouble()

            resultText.setText("" + converttoFoot(Meter) + " " + "Foot")
        }
    }
    fun converttoFoot(Meter : Double): Double{
        var Foot = Meter*3.28084
        return Foot
    }
}