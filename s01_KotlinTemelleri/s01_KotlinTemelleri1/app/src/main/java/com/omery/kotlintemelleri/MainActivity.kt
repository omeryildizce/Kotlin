package com.omery.kotlintemelleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val degiskenler = Degiskenler()
        // degiskenler.degiskenler()
        // degiskenler.sabitler()
        // degiskenler.veriTipleri()
        // degiskenler.veriDonusturme()

        // val koleksiyonlar = Koleksiyonlar()
        // koleksiyonlar.yazdir()

        //val kosulluIfadeler = KosulluIfadeler()
        //kosulluIfadeler.yazdir()

        val donguler = Donguler().yazdir()

    }
}