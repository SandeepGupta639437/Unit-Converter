package com.example.t5_sandeep_2312067

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val secondAdsButton = findViewById<androidx.cardview.widget.CardView>(R.id.kgtopounds)
        secondAdsButton.setOnClickListener{
            val intent2= Intent(this,KgToPounds::class.java)
            startActivity(intent2)
        }
        val second1AdsButton = findViewById<androidx.cardview.widget.CardView>(R.id.masstoweight)
        second1AdsButton.setOnClickListener{
            val intent2= Intent(this,MassToWeight::class.java)
            startActivity(intent2)
        }
        val second2AdsButton = findViewById<androidx.cardview.widget.CardView>(R.id.hourtosecond)
        second2AdsButton.setOnClickListener{
            val intent2= Intent(this,HourToSecond::class.java)
            startActivity(intent2)
        }
        val second3AdsButton = findViewById<androidx.cardview.widget.CardView>(R.id.celciustokelvin)
        second3AdsButton.setOnClickListener{
            val intent2= Intent(this,CelciusToKelvin::class.java)
            startActivity(intent2)
        }
        val second4AdsButton = findViewById<androidx.cardview.widget.CardView>(R.id.metertofoot)
        second4AdsButton.setOnClickListener{
            val intent2= Intent(this,MeterToFoot::class.java)
            startActivity(intent2)
        }
        val second5AdsButton = findViewById<androidx.cardview.widget.CardView>(R.id.mphtokph)
        second5AdsButton.setOnClickListener{
            val intent2= Intent(this,mphTokph::class.java)
            startActivity(intent2)
        }

    }
}