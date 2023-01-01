package com.omery.kullaniciadisaklama

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    var alinanKullaniciAdi: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Shared prefences
        sharedPreferences =
            this.getSharedPreferences("com.omery.kullaniciadisaklama", Context.MODE_PRIVATE)
        alinanKullaniciAdi = sharedPreferences.getString("kullanici", "")
        if (alinanKullaniciAdi != null) {
            textView.text = "Kullanıcı Adı: ${alinanKullaniciAdi}"
        }

    }

    fun kaydet(view: View) {
        val kullaniciAdi = editText.text.toString()
        if (kullaniciAdi == "") {
            Toast.makeText(this, "Lütfen bir değer giriniz!", Toast.LENGTH_LONG).show()
        } else {
            sharedPreferences.edit().putString("kullanici", kullaniciAdi).apply()
            textView.text = "Kullanıcı Adı: ${kullaniciAdi}"
        }
    }

    fun sil(view: View) {
        alinanKullaniciAdi = sharedPreferences.getString("kullanici", "")
        if (alinanKullaniciAdi != null) {
            textView.text = "Kullanıcı Adı: "
            sharedPreferences.edit().remove("kullanici").apply()
        }
    }
}