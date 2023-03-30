package com.example.superheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VehiculosActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehiculos3)
    }

    fun openVillanos(@Suppress("UNUSED_PARAMETER")view: View) {
        val intent = Intent(this, Villanos::class.java).apply {  }
        startActivity(intent)
    }

    fun openMain(@Suppress("UNUSED_PARAMETER")view: View) {
        val intent = Intent(this, MainActivity::class.java).apply {  }
        startActivity(intent)
    }

    fun openForm(@Suppress("UNUSED_PARAMETER")view: View) {
        val intent = Intent(this, RegistroFormActivity::class.java).apply {  }
        startActivity(intent)
    }

}