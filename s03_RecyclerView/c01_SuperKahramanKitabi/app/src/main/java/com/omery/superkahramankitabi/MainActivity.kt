package com.omery.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // veri
        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Ironman")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Spiderman")

        // verimsiz tanimlamalar
        /*
        val batmanBitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.batman)
        val supermanBitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.superman)
        val ironmanBitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.ironman)
        val aquamanBitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.aquaman)
        val spidermanBitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.spiderman)
        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(ironmanBitmap)
        superKahramanGorselleri.add(aquamanBitmap)
        superKahramanGorselleri.add(spidermanBitmap)
        */
        // Verimli Tanımlamalar
        val batmanDrawableId = R.drawable.batman
        val supermaDrawableId = R.drawable.superman
        val ironmanDrawableId = R.drawable.ironman
        val aquamanDrawableId = R.drawable.aquaman
        val spidermanDrawableId = R.drawable.spiderman
        var superKahramanDrawableListesi = ArrayList<Int>()
        superKahramanDrawableListesi.add(batmanDrawableId)
        superKahramanDrawableListesi.add(supermaDrawableId)
        superKahramanDrawableListesi.add(ironmanDrawableId)
        superKahramanDrawableListesi.add(aquamanDrawableId)
        superKahramanDrawableListesi.add(spidermanDrawableId)
        // Adapter
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = RecyclerAdapter(superKahramanIsimleri, superKahramanDrawableListesi)
        recyclerView.adapter = adapter
    }

}