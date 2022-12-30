package com.omery.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Fonksiyonlar
        // fonksiyon()
        // sinif()
        nullGuvenligi()
    }

    fun nullGuvenligi() {
        // Null, nullability, null safety
        var benimStringim: String? = null
        println(benimStringim)

        var benimYasim: Int? = null
        println(benimYasim)
        if (benimYasim != null) {
            println(benimYasim * 2)
        }
        else{
            println("null")
        }
        // !! not null - ? null
        println(benimYasim?.minus(2))
        // elvis

        val sonuc= benimYasim?.minus(4)?: 10
        println(sonuc)
        // let
        benimYasim?.let {
            println(it * 5)
        }

    }

    fun sinif() {
        var superman = SuperKahraman("Superman", 45, "Gazeteci")
        textView.text = superman.superKahramanBilgileri()
        var spiderman = SuperKahraman("Spiderman", 24, "Gazeteci")
        textView.text = spiderman.superKahramanBilgileri()
        println(spiderman.sacRenginiAl())


    }

    fun fonksiyon() {
        val fonksiyonlar = Fonksiyonlar()
        fonksiyonlar.ilkFonksiyon()
        textView.text = "Sonuç : " + fonksiyonlar.cikarma(17, 7).toString()

        button.setOnClickListener()
        {
            val cikarma1 = Fonksiyonlar().cikarma(4855, 586)
            textView.text = "Sonuç: " + cikarma1.toString()
        }
    }
    /*
    fun degistir(view: View){
        val cikarma = Fonksiyonlar().cikarma(48854488,564558477)
        textView.text = "Sonuç: " + cikarma
    }*/

}