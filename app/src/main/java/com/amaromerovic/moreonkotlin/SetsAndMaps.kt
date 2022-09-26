package com.amaromerovic.moreonkotlin



fun main() {

    var fruits = setOf("Orange", "Apple", "Grape", "Apple")
    println(fruits.size)

    println("=====================================================================")
    fruits = setOf("Orange", "Apple", "Mango", "Grape", "Apple")
    println(fruits.size)

    println("=====================================================================")
    fruits = setOf("Orange", "Apple", "Mango", "Grape", "Apple", "Orange")
    println(fruits.size)

    println("=====================================================================")
//    fruits.add("Pear")
    println(fruits)

    println("=====================================================================")
    println(fruits.toSortedSet())

    println("=====================================================================")
    val newFruits = fruits.toMutableSet()
    newFruits.add("Watermelon")
    newFruits.add("Peach")
    println(newFruits)

    println("=====================================================================")
    println(newFruits.elementAt(4))



    println("=====================================================================")
    val daysOfTheWeek = mapOf(
        1 to "Monday",
        2 to "Tuesday",
        3 to "Wednesday",
        4 to "Thursday",
        5 to "Friday",
        6 to "Sunday",
        7 to "Saturday"
    )
    for (i in daysOfTheWeek) {
        println("${i.key} ${i.value}")
    }

    println("=====================================================================")
    println(daysOfTheWeek[2])

    println("=====================================================================")
    val fruitsMap = mapOf("Grape" to MyFruit("Grape", 4.2), "Banana" to MyFruit("Banana", 3.4))
    for (i in fruitsMap.keys) {
        println("Key: $i | Value: ${fruitsMap[i]}")
    }

    println("=====================================================================")
    val newFruitMap = fruitsMap.toMutableMap()
    newFruitMap.set("Kiwi", MyFruit("Kiwi", 6.5))
    newFruitMap.set("Strawberry", MyFruit("Strawberry", 1.5))
    for (i in newFruitMap.keys) {
        println("Key: $i | Value: ${newFruitMap[i]}")
    }

    println("=====================================================================")
    println(newFruitMap.toSortedMap())

}


data class MyFruit(val name: String, val price: Double)