package com.example.multimedia_t7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.multimedia_t7.databinding.ActivityMainBinding
import com.example.multimedia_t7.databinding.ActivityPantallaRazasMasClasesBinding

class pantallaRazasMasClases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaRazasMasClasesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val enviarImagen = bundle?.getString("enviarImagen")

        binding.fotoClase.setImageResource(enviarImagen)

    }
}

private fun ImageView.setImageResource(enviarImagen: String?) {

}
