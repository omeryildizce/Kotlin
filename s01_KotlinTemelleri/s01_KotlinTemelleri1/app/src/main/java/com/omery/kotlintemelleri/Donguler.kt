package com.omery.kotlintemelleri

class Donguler {
    fun yazdir() {
        println("----For----")
        val baskaBirDizi = arrayOf(5, 10, 15, 20, 25, 30)
        for (numara in baskaBirDizi) {
            println(numara)
        }
        for (indeks in baskaBirDizi.indices) {
            println(indeks)
        }
        for (b in 0..9) {
            println(b)
        }
        val benimStringDizim = ArrayList<String>()
        benimStringDizim.add("Ömer")
        benimStringDizim.add("YILDIZ")
        for (isim in benimStringDizim) {
            println(isim)
        }
        benimStringDizim.forEach {
            println(it)
        }
        println("----While----")
        var j = 0
        while (j<10){
            println(j++)

        }
    }
}