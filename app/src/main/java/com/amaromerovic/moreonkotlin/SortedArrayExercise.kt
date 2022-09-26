package com.amaromerovic.moreonkotlin

import java.util.*

fun main() {

    printArray(sortIntegers(getIntegers()))

}


fun getIntegers(): IntArray {
    val scanner = Scanner(System.`in`)
    val intArray = IntArray(3)

    var i = 0

    while (i < intArray.size) {
        print("Enter a number: ")
        if (scanner.hasNextInt()) {
            intArray[i] = scanner.nextInt()
            i++
        } else {
            println("You can only enter numbers")
        }
        scanner.nextLine()
    }
    scanner.close()
    return intArray
}

fun printArray(array: IntArray) {
    println("Sorted descending: ${array.contentToString()}")
}


fun sortIntegers(array: IntArray): IntArray {
    return array.sortedArrayDescending()
}