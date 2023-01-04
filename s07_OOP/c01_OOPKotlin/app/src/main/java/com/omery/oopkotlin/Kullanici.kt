package com.omery.oopkotlin

class Kullanici : Insan {

    var isim: String? = null
    var yas: Int? = null

    constructor(isim: String, yas: Int) {
         this.isim = isim
        this.yas = yas
        println("Constructor")
    }
    init {
        println("init çağrıldı")
    }

    override fun toString(): String {
        return "Kullanici(isim=$isim, yas=$yas)"
    }


}