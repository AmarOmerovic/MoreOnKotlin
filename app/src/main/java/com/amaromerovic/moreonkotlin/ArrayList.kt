package com.amaromerovic.moreonkotlin

fun main() {
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println("...Print Array List...")
    for (i in arrayList) {
        println(i)
    }

    println("=========================================================================================================")

    val anotherArrayList = ArrayList<String>()
    val list = mutableListOf<String>()

    list.add("One")
    list.add("Two")
    anotherArrayList.addAll(list)

    println("...Print Array List...")
    var itr = anotherArrayList.iterator()
    while (itr.hasNext()){
        println(itr.next())
    }

    println("=========================================================================================================")

    anotherArrayList.add("Three")
    anotherArrayList.add("Four")
    anotherArrayList.add("Five")
    anotherArrayList.add("Six")
    anotherArrayList.add("Seven")

    itr = anotherArrayList.iterator()
    while (itr.hasNext()){
        println(itr.next())
    }
    println("=========================================================================================================")
    println("Size: $anotherArrayList.size")
    println("=========================================================================================================")

    println(anotherArrayList.get(2))

}
