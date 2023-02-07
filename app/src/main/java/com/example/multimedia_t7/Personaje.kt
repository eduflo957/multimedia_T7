package com.example.multimedia_t7

class Personaje {
    val fuerza = rand(10,15)
    val defensa = rand(1,5)
    val tamMochila = 100
    val vida = 200
    val monedero = 0




    fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
        return (start..end).random()
    }

    override fun toString(): String {
        return "Personaje(fuerza=$fuerza, defensa=$defensa \r tamMochila=$tamMochila, vida=$vida, monedero=$monedero)"
    }
}