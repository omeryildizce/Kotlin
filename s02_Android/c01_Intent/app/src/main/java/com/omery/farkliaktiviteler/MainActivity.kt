package com.omery.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numara = 1
        println("on create çağrıldı")
    }

    override fun onStart() {
        super.onStart()
        println("on start çağrıldı")

    }

    override fun onResume() {
        super.onResume()
        println("on resume çağrıldı")

    }

    override fun onPause() {
        super.onPause()
        println("on pause çağrıldı")

    }

    override fun onStop() {
        super.onStop()
        println("on stop çağrıldı")

    }

    override fun onDestroy() {
        super.onDestroy()
        println("on destroy çağrıldı")

    }
    fun aktiviteDegistir(view: View){
        val kullaniciVerisi = editText.text.toString()
        val intent = Intent(applicationContext, SecondActivity::class.java)
        intent.putExtra("yollananVeri", kullaniciVerisi)
        startActivity(intent)
        finish()
    }
}