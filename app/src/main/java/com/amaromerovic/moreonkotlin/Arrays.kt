package com.amaromerovic.moreonkotlin

fun main() {

//    val numbers: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9)
//    val numbers = intArrayOf(1,2,3,4,5,6,7,8,9)

    val numbers = arrayOf(1, 2, 3, 4, 10, 6, 7, 8, 9)
    println("Initial values ${numbers.contentToString()}")
    println("===============================================================================================")

    numbers[0] = 9
    numbers[1] = 14
    numbers[4] = 40
    numbers[5] = 101
    println("Changed values ${numbers.contentToString()}")

    println("===============================================================================================")


    val testArray = arrayOfNulls<Int>(10)
    println(testArray.contentToString())
    println("===============================================================================================")
    testArray[0] = 2
    for (i in testArray) {
        i?.let {
            println(it)
        }
    }
    println("===============================================================================================")

    val anotherArray = IntArray(10)
    println(anotherArray.contentToString())
    println("===============================================================================================")
    anotherArray[2] = 5
    for (i in anotherArray) {
        println(i)
    }
    println("===============================================================================================")

    for (i in numbers) {
        println(i)
    }
    println("===============================================================================================")


    for (i in numbers) {
        println(i+2)
    }

    println("===============================================================================================")

    val doubleArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0)
    println(doubleArray.contentToString())
    println("===============================================================================================")

    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    println(days.contentToString())
    println("===============================================================================================")

    val fruitList = arrayOf(Fruit("Apple", 2.0), Fruit("Grape", 2.9), Fruit("Banana", 4.3))
    println(fruitList.contentToString())
    println("===============================================================================================")
    println(fruitList[1])
    println("===============================================================================================")
    for (i in fruitList.indices) {
        println("Index $i | ${fruitList[i].name} | ${fruitList[i].price}")
    }
    println("===============================================================================================")


    val mix = arrayOf("Sun", "Mon", "Tues", 1, 2, 3, Fruit("Mango", 1.3))
    println(mix.contentToString())


}

data class Fruit(val name: String, val price: Double)