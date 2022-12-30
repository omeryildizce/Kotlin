package com.omery.kotlintemelleri

class Koleksiyonlar {
    fun yazdir() {
        println("----------Dizi-------------")
        val benimDizim = arrayOf("Ömer", "Yıldız", "kadir", "anil")
        println("size " + benimDizim.size)
        println("indices " + benimDizim.indices)
        println("lastIndex " + benimDizim.lastIndex)
        println("[0] " + benimDizim[0])
        println("[1] " + benimDizim.get(1))
        println("[2].set " + benimDizim.set(2, "Ali"))
        val numaraDizisi = intArrayOf(1,2,3)
        println("[1] " + numaraDizisi.get(1))
        val karisikDizi = arrayOf("Ömer", 'a', 1, 1.0f, 1.0, false)
        println(karisikDizi.get(5))

        println("----------ArrayList-------------")
        val isimListesi = arrayListOf<String>("Ömer","YILDIZ")
        println(isimListesi[0])
        println(isimListesi.get(1))
        isimListesi.add("Ali")
        println(isimListesi[2])

        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add(1)
        karisikArrayList.add(false)
        karisikArrayList.add("String")

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(140)

        println("----------Set-------------")
        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index[2] ${ornekDizi[2]}")
        println("index[3] ${ornekDizi[3]}")
        println("size: "+ ornekDizi.size)
        val benimSet = setOf<Int>(7,8,9,9,9,10)
        println("size: "+ benimSet.size)
        // for each
        benimSet.forEach{
            println(it)
        }
        val digerSet = HashSet<String>()
        digerSet.add("Ömer")
        digerSet.add("Ömer")
        println(digerSet.size)
        digerSet.forEach {
            println(it)
        }

        println("----------Map-------------")
        val yemekDizisi = arrayOf("Elma", "Tavuk", "Et")
        val kaloriDizisi = arrayOf(100,300,200)
        println("${yemekDizisi[0] } : ${kaloriDizisi[0]}")
        println("${yemekDizisi[1] } : ${kaloriDizisi[1]}")
        println("${yemekDizisi[2] } : ${kaloriDizisi[2]}")

        val yemekKaloriMap = hashMapOf<String, Int>()
        yemekKaloriMap["elma"] = 100
        yemekKaloriMap["et"] = 300
        yemekKaloriMap["tavuk"] = 200
        yemekKaloriMap.put("Karpuz", 75)

        println("${yemekKaloriMap.get("elma")}")
        val benimMapim = HashMap<String,String>()
        benimMapim.put("elma","500")

        val yeniMap = hashMapOf<String, Int>("Ömer" to 7, "Ali" to 45)

    }
}