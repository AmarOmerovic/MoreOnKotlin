package com.amaromerovic.moreonkotlin

fun main() {
    addNumbers(5, 10)

    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sum.invoke(5, 10))

    val anotherSum = { a: Int, b: Int -> println(a + b) }
    anotherSum.invoke(5, 10)

    val anotherOne = { a: Int, b: Int -> a + b }
    val test = anotherOne.invoke(5, 10)
    println("Test: $test")
}

fun addNumbers(a: Int, b: Int) {
    println(a + b)
}
