package com.omery.kotlintemelleri

class Degiskenler {

    fun veriDonusturme()
    {
        println("---Dönüştürme---")
        val benimInt = 10
        val benimLong = benimInt.toLong()

        val sayi1 = "10"
        val sayi2 = 20
        println(sayi1 + sayi2)          // output: 1020
        println(sayi1.toInt() + sayi2)  // output: 30

    }
    fun veriTipleri() {
        // Veri tipleri
        // Int
        println("-----Int-----")
        val sayi1: Int
        sayi1 = 7
        val sayi2: Int = 15
        println("min:  " + Int.MIN_VALUE)
        println("max:  " + Int.MAX_VALUE)
        println("bit:  " + Int.SIZE_BITS)
        println("byte: " + Int.SIZE_BYTES)
        println()
        // Long
        println("-----Long-----")
        val sayi3: Long
        val sayi4: Long = 15
        sayi3 = 15
        println("min:  " + Long.MIN_VALUE)
        println("max:  " + Long.MAX_VALUE)
        println("bit:  " + Long.SIZE_BITS)
        println("byte: " + Long.SIZE_BYTES)
        println()
        // Short
        println("-----Short-----")
        val sayi5: Long
        val sayi6: Long = 15
        sayi5 = 15
        println("min:  " + Short.MIN_VALUE)
        println("max:  " + Short.MAX_VALUE)
        println("bit:  " + Short.SIZE_BITS)
        println("byte: " + Short.SIZE_BYTES)
        println()
        // Byte
        println("-----Byte-----")
        val sayi7: Long
        val sayi8: Long = 15
        sayi7 = 15
        println("min:  " + Byte.MIN_VALUE)
        println("max:  " + Byte.MAX_VALUE)
        println("bit:  " + Byte.SIZE_BITS)
        println("byte: " + Byte.SIZE_BYTES)
        println()
        // Float
        println("-----Float-----")
        val sayi9: Float
        val sayi10: Float = 15.01f
        sayi9 = 15.00f
        println("min:  " + Float.MIN_VALUE)
        println("max:  " + Float.MAX_VALUE)
        println("bit:  " + Float.SIZE_BITS)
        println("byte: " + Float.SIZE_BYTES)
        println()
        // Double
        println("-----Double-----")
        val sayi11: Double
        val sayi12: Double = 3.14
        sayi11 = 15.0
        println("min:  " + Double.MIN_VALUE)
        println("max:  " + Double.MAX_VALUE)
        println("bit:  " + Double.SIZE_BITS)
        println("byte: " + Double.SIZE_BYTES)
        println()
        // Double
        println("-----Double-----")
        val char1: Char
        val char2: Char = 'A'
        char1 = 'a'
        println("chaar1: " + char1)
        println("code:  " + char1.code)
        println("category:  " + char1.category)
        println("directionality :  " + char1.directionality)
        println()
        // String
        println("-----String-----")
        val string1: String
        val string2: String = "3.14"
        string1 = "Merhaba Dünya : hello world"
        println("String:  " + string1)
        println("length: " + string1.length)
        println("lowercase: " + string1.lowercase())
        println("uppercase: " + string1.uppercase())
        println()
        // Boolean
        println("-----Booolean-----")
        val true1: Boolean
        val false1: Boolean = false
        true1 = true
        println("True: " + true1)
        println("False: " + false1)
        println("0 <  1 : " + (0 < 1))
        println("0 <= 1 : " + (0 <= 1))
        println("0 >  1 : " + (0 > 1))
        println("0 >= 1 : " + (0 >= 1))
        println("0 == 1 : " + (0 == 1))
        println("0 != 1 : " + (0 != 1))
        println("---&& (and) || (or)---")
        println("0 && 0 : " + (false && false))
        println("0 && 1 : " + (false && true))
        println("1 && 0 : " + (true && false))
        println("1 && 1 : " + (true && true))
        println("0 || 0 : " + (false || false))
        println("0 || 1 : " + (false || true))
        println("1 || 0 : " + (true || false))
        println("1 || 1 : " + (true || true))
        println()
    }

    fun sabitler() {
        // Sabitler val
        var yas = 60
        val pi = 3.1
        val x = 5
        val y = 20
        yas -= x
        println(x + y)
        println(yas * x)
        val yasSonucu = yas * x
        val yasSonucu1 = yas * x * pi
        println(yasSonucu + yasSonucu1)
    }

    fun degiskenler() {
        // Değişkenler var
        val a = 5
        val b = 10
        println(a * b)
        var yas = 50
        println(yas / 5 * 8)
        yas = 60
        println(yas)
    }
}