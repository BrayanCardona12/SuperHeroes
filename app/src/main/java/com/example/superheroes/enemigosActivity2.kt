package com.example.superheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EnemigosActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enemigos2)
    }

    fun openMain(@Suppress("UNUSED_PARAMETER")view: View) {

            val intent = Intent(this, MainActivity::class.java).apply {  }
            startActivity(intent)

    }

    fun openForm(@Suppress("UNUSED_PARAMETER")view: View) {
        val intent = Intent(this, RegistroFormActivity::class.java).apply {  }
        startActivity(intent)
    }

    fun openVehiculos(@Suppress("UNUSED_PARAMETER")view: View) {
        val intent = Intent(this, VehiculosActivity3::class.java).apply {  }
        startActivity(intent)
    }

}