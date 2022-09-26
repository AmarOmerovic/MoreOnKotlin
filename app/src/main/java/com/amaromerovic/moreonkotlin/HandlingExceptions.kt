package com.amaromerovic.moreonkotlin

fun main() {
    var str = getNumbers("10")
    println(str)
    str = getNumbers("10.5")
    println(str)

    validate(15)
    println("code after validation check...")
}

fun getNumbers(string: String): Int {
    return try {
        string.toInt()
    } catch (e: ArithmeticException) {
        0
    } catch (e: java.lang.NumberFormatException) {
        0
    } finally {
        println("Executed")
    }
}

fun validate(age: Int) {
    if (age < 18) {
        throw java.lang.Exception("Underage")
    } else {
        println("Eligible for drive")
    }
}