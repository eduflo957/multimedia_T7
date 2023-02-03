package com.example.multimedia_t7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimedia_t7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Aquí en el ActivityRazasBinding llamo al binding
        //El binding está en el gradle
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var enviarImagenClase = R.drawable.multimedia_t7_inicio2

        binding.buttonBerseker.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.multimedia_t7_berserker_2)
            enviarImagenClase = R.drawable.multimedia_t7_berserker_2
        }

        binding.buttonGuerrero.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.multimedia_t7_guerrero_2)
            enviarImagenClase = R.drawable.multimedia_t7_guerrero_2
        }

        binding.buttonLadron.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.multimedia_t7_ladron_2)
            enviarImagenClase = R.drawable.multimedia_t7_ladron_2
        }

        binding.buttonMago.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.multimedia_t7_mago_2)
            enviarImagenClase = R.drawable.multimedia_t7_mago_2
        }

        binding.buttonInicio.setOnClickListener {
            val intentClase = Intent(this, razas::class.java)
            intentClase.putExtra("enviarImagenClase", enviarImagenClase)
            startActivity(intentClase)
        }
    }
}