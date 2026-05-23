package com.example.miappcodelab

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miappcodelab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener {

            val nombre = binding.etNombre.text.toString()

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("NOMBRE", nombre)

            startActivity(intent)
        }
    }
}