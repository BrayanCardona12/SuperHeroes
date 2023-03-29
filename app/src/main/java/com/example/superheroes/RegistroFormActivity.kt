package com.example.superheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegistroFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_form)
    }

    fun openVillanos(@Suppress("UNUSED_PARAMETER")view: View) {
        val intent = Intent(this, EnemigosActivity2::class.java).apply {  }
        startActivity(intent)
    }

    fun openMain(@Suppress("UNUSED_PARAMETER")view: View) {
        val intent = Intent(this, MainActivity::class.java).apply {  }
        startActivity(intent)
    }

    fun openVehiculos(@Suppress("UNUSED_PARAMETER")view: View) {
        val intent = Intent(this, VehiculosActivity3::class.java).apply {  }
        startActivity(intent)
    }

}