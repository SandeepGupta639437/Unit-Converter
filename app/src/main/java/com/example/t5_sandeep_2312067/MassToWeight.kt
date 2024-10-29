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

class MassToWeight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mass_to_weight)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homeButton: Button = findViewById<Button>(R.id.Home_Button)

        homeButton.setOnClickListener{
            val intent = Intent(this@MassToWeight , MainActivity::class.java)
            startActivity(intent)
        }
        val edt : EditText = findViewById<EditText>(R.id.MassText)
        val btn : Button = findViewById<Button>(R.id.buttonMassToWeight)
        val resultText: TextView = findViewById<TextView>(R.id.WeightResult)
        btn.setOnClickListener(){
            val Mass : Double = edt.text.toString().toDouble()

            resultText.setText("" + converttoWeight(Mass) + " " + "Weight")
        }
    }
    fun converttoWeight(Mass : Double): Double{
        var Weight = Mass*9.8

        return Weight
    }
}