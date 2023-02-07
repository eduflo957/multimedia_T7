package com.example.multimedia_t7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimedia_t7.databinding.ActivityRazasBinding

class Razas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Aquí en el ActivityRazasBinding llamo al binding
        val binding = ActivityRazasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var enviarImagenRaza = R.drawable.multimedia_t7_inicio_razas_2
        var enviarImagenClase = intent.getIntExtra("enviarImagenClase", 0)

        binding.buttonElfo.setOnClickListener {
            binding.imageViewInicioRazas.setImageResource(R.drawable.multimedia_t7_elfo_razas_2)
            enviarImagenRaza = R.drawable.multimedia_t7_elfo_razas_2
        }

        binding.buttonEnano.setOnClickListener {
            binding.imageViewInicioRazas.setImageResource(R.drawable.multimedia_t7_enano_razas_2)
            enviarImagenRaza = R.drawable.multimedia_t7_enano_razas_2
        }

        binding.buttonGoblin.setOnClickListener {
            binding.imageViewInicioRazas.setImageResource(R.drawable.multimedia_t7_goblin_razas_2)
            enviarImagenRaza = R.drawable.multimedia_t7_goblin_razas_2
        }

        binding.buttonHumano.setOnClickListener {
            binding.imageViewInicioRazas.setImageResource(R.drawable.multimedia_t7_humano_razas_2)
            enviarImagenRaza = R.drawable.multimedia_t7_humano_razas_2
        }

        binding.buttonInicioRazas.setOnClickListener {
            val intent = Intent(this, PantallaRazasMasClases::class.java)
            intent.putExtra("enviarImagenRaza", enviarImagenRaza)
            intent.putExtra("enviarImagenClase", enviarImagenClase)

            startActivity(intent)
        }

    }
}