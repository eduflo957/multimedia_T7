package com.example.multimedia_t7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = clases.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bElPGuerrero.setOnClickListener {
            binding.imgElClase.setImageResource(R.drawable.multimedia_t7_berserker)
        }

        binding.bElPLadron.setOnClickListener {
            binding.imgElClase.setImageResource(R.drawable.multimedia_t7_guerrero)
        }

        binding.bElPMago.setOnClickListener {
            binding.imgElClase.setImageResource(R.drawable.multimedia_t7_ladron)
        }

        binding.bElPBerserker.setOnClickListener {
            binding.imgElClase.setImageResource(R.drawable.multimedia_t7_mago)
        }

        binding.bElPInicio.setOnClickListener {
            val intent = Intent(this, PantallaClases::class.java)
            startActivity(intent)
        }
    }
}