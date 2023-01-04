package com.omery.oopkotlin

class Kopek : Hayvan() {
    fun kopekFonksiyonu()
    {
        super.sesCikar()
    }
    override fun sesCikar(){
        println("hav")
    }
}