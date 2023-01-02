package com.omery.sqliteproject

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            val veriTabani = this.openOrCreateDatabase("urunler", Context.MODE_PRIVATE, null)
            veriTabani.execSQL("create table if not exists urunler (id integer primary key, isim varchar, fiyat int)")
/*
            veriTabani.execSQL("insert into urunler (isim, fiyat) values ('Ayakkabı',100) ")
            veriTabani.execSQL("insert into urunler (isim, fiyat) values ('Elbise',150)")
            veriTabani.execSQL("insert into urunler (isim, fiyat) values ('Kazak',50) ")
            veriTabani.execSQL("insert into urunler (isim, fiyat) values ('Atkı',200) ")
            veriTabani.execSQL("insert into urunler (isim, fiyat) values ('Bere',10)")
            veriTabani.execSQL("insert into urunler (isim, fiyat) values ('Mont',300) ")
  */
            //  veriTabani.execSQL("delete from urunler where id = 6")
            //  veriTabani.execSQL("update urunler set fiyat = 250 where id = 1")
            
            val cursor = veriTabani.rawQuery("select * from urunler ", null)
            //  val cursor = veriTabani.rawQuery("select * from urunler where isim = 'Bere'", null)
            //  val cursor = veriTabani.rawQuery("select * from urunler where id = 4", null)
            //  val cursor = veriTabani.rawQuery("select * from urunler where isim like '%ak%'", null)

            val idColumnIndex = cursor.getColumnIndex("id")
            val isimColumnIndex = cursor.getColumnIndex("isim")
            val fiyatColumnIndex = cursor.getColumnIndex("fiyat")
            while (cursor.moveToNext()) {
                println("id: ${cursor.getInt(idColumnIndex)}")
                println("isim: ${cursor.getString(isimColumnIndex)}")
                println("fiyat: ${cursor.getInt(fiyatColumnIndex)}")
                textView7.text =
                    "id: ${cursor.getInt(idColumnIndex)}\nisim: ${cursor.getString(isimColumnIndex)}\nfiyat: ${
                        cursor.getInt(fiyatColumnIndex)
                    }\n"
            }
            cursor.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}