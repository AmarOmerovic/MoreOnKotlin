package com.amaromerovic.moreonkotlin

import kotlin.random.Random

fun main() {
    val arrayList = ArrayList<Double>()

    for (i in 0 until 5) {
        val randomNumber = Random.nextDouble(1.0, 5.0)
        arrayList.add(randomNumber)
        println(randomNumber)
    }

    var result = 0.0
    for (i in 0 until arrayList.size) {
        result += arrayList[i]
    }

    println("Sum: $result")

    result /= arrayList.size
    println("Average: $result")




}