package com.omery.contextproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Toast, alert
        // applicationsContext -> app context
        // this, this@mainActivity -> activity context
        Toast.makeText(this, "Hoşgeldiniz", Toast.LENGTH_LONG).show()
    }

    fun mesajGoster(view: View) {
        val uyariMesaji =AlertDialog.Builder(this)
        uyariMesaji.setTitle("Şifre hatası")
        uyariMesaji.setMessage("Şifreyi girmediniz, tekrar denemek istermisiniz.")
        uyariMesaji.setPositiveButton("Evet", DialogInterface.OnClickListener{dialogInterface, i ->
            Toast.makeText(this, "Baştan deniyorsunuz.", Toast.LENGTH_LONG).show()
        })
        uyariMesaji.setNegativeButton("Hayır" ) {dialogInterface, i->
            Toast.makeText(this, "Hayırı seçtiniz.", Toast.LENGTH_LONG).show()
        }
        uyariMesaji.show()
    }

}
