package com.example.multimedia_t7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PantallaClases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = clases.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bElRElfo.setOnClickListener {
            binding.imgElRaza.setImageResource(R.drawable.jesucristo_elfo)
        }

        binding.bElREnano.setOnClickListener {
            binding.imgElRaza.setImageResource(R.drawable.jesucristoenano)
        }



        binding.bElRGoblin.setOnClickListener {
            binding.imgElRaza.setImageResource(R.drawable.jesucristo_goblin)
        }



        binding.bElRHumano.setOnClickListener {
            binding.imgElRaza.setImageResource(R.drawable.jesucristo_humano)
        }
    }
}