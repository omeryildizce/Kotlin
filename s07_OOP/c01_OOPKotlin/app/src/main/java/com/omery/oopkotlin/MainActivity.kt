package com.omery.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-----Sınıflar-----")
        val kullanici = Kullanici("Ömer", 15)
        val digerKullanici = Kullanici("Ali", 25)

        println("-----Encapsulation-----")
        val ahmet = Sanatci("Ahmet", 45, "Müzisyen")
        println(ahmet.isim)
        println(ahmet.yas)
        println("-----Inheritance-----")
        val mehmet = OzelSanatci("mehmet", 23, "müzisyen")
        mehmet.isim
        mehmet.sarkiSoyle()

        println("-----Polymorphism-----")
        // statik
        val hesap = Islemler()
        hesap.carpma()
        hesap.carpma(10)
        hesap.carpma(15, 21)

        //dinamik
        val kopek = Kopek()
        println(kopek.sesCikar())
        println(kopek.kopekFonksiyonu())
        val hayvan = Hayvan()
        println(hayvan.sesCikar())

        println("-----Abstract && Interface-----")
        kullanici.insanFonksiyonu()

        var gitar = Gitar()
        gitar.marka = "Gitar markası"
        gitar.elektro = false
        gitar.oda = "oda"
        gitar.bilgi()

        println("-----Lambda-----")
        yazdir("yazdır")
        val yazdirLambda = {string:String -> println(string) }
        yazdirLambda("yazdir")
        val carpmaIslemi = {s1:Int,s2:Int -> s1 * s2}
        println(carpmaIslemi(10,7))
        val carmpa2 : (Int,Int) -> Int = {a, b -> a * b}
    }
    fun yazdir(string:String)
    {
        println(string)
    }
}