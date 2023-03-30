package com.example.superheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun openVillanos(@Suppress("UNUSED_PARAMETER")view: View) {
        val intent = Intent(this, Villanos::class.java).apply {  }
        startActivity(intent)
    }


    fun openForm(@Suppress("UNUSED_PARAMETER")view: View) {
        val intent = Intent(this, RegistroFormActivity::class.java).apply {  }
        startActivity(intent)
    }

    fun openVehiculos(@Suppress("UNUSED_PARAMETER")view: View?) {
        val intent = Intent(this, VehiculosActivity3::class.java).apply {  }
        startActivity(intent)
    }

}