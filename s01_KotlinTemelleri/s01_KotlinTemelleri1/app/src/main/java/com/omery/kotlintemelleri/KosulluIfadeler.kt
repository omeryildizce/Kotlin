package com.omery.kotlintemelleri

class KosulluIfadeler {
    fun yazdir() {
        println("----Matematiksel İşlemler----")
        var sayi = 8
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)
        var digerSayi = 10
        println(digerSayi > sayi)
        println(digerSayi < sayi)

        println("----If Statements----")
        val skor = 10
        if (skor < 10) {
            println("Oyunu kaybettiniz.")
        } else if (skor >= 10 && skor < 20) {
            println("İyi skor aldınız.")
        } else {
            println("Rekor kırdınız.")
        }

        println("----When - Switch----")
        var notRakami = 4
        var notStringi = ""
        when(notRakami)
        {
            0 -> notStringi = "Geçerisiz not"
            1 -> notStringi = "Kötü"
            2 -> notStringi = "Zayıf"
            3 -> notStringi = "Orta"
            4 -> notStringi = "İyi"
            5 -> notStringi = "Pekiyi"
            else -> notStringi = "Geçersiz değer girdiniz"
        }
        println(notStringi)
    }
}