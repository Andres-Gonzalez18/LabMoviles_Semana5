package com.example.miappcodelab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miappcodelab.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nombre = intent.getStringExtra("NOMBRE") ?: "Invitado"

        binding.tvBienvenida.text = "¡Hola, $nombre!"
    }
}