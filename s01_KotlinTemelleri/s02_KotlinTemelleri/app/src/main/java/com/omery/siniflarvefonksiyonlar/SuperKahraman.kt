package com.omery.siniflarvefonksiyonlar


class SuperKahraman(var isim: String, var yas: Int, var meslek: String) {
    // Access level
    // private - protected - internal - public
    private var sacRengi = "Kırmızı"
    // Getter
    fun sacRenginiAl(): String {
        return this.sacRengi
    }
    // setter
    fun sacRenginiDegistir(renk : String) {
        this.sacRengi = renk
    }

    fun superKahramanBilgileri(): String {
        return "İsim: ${this.isim} \nYaş: ${this.yas} \nMeslek: ${this.meslek}"
    }


}