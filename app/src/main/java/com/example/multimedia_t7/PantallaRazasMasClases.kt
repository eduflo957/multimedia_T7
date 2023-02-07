package com.example.multimedia_t7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.multimedia_t7.databinding.ActivityPantallaRazasMasClasesBinding

class PantallaRazasMasClases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaRazasMasClasesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var fotoClase = findViewById<ImageView>(R.id.fotoClase)
        var fotoTraidaClase = intent.getIntExtra("enviarImagenClase", 0)
        fotoClase.setImageResource(fotoTraidaClase)


        var fotoRaza = findViewById<ImageView>(R.id.fotoRaza)
        var fotoTraidaRaza = intent.getIntExtra("enviarImagenRaza", 0)
        fotoRaza.setImageResource(fotoTraidaRaza)

        binding.valoresPorDefecto.text = personaje1.toString()

    }
}

