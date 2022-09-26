package com.amaromerovic.moreonkotlin

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    println("Smallest number: ${findMin(readElements(readInteger()))}")
}

fun readInteger(): Int {
    while (true) {
        print("Enter the number of elements you want to input: ")
        if (scanner.hasNextInt()) {
            return scanner.nextInt()
        } else {
            println("Please enter a whole number!")

        }
        scanner.next()
    }
}

fun readElements(element: Int): IntArray {
    println("You need to enter $element numbers")
    var i = 0
    val array = IntArray(element)

    while (i < array.size) {
        print("Please enter a number: ")
        if (scanner.hasNextInt()) {
            array[i] = scanner.nextInt()
            i++
            scanner.nextLine()
        } else {
            println("You can only enter whole numbers!")
            scanner.next()
        }
    }

    return array
}

fun findMin(array: IntArray): Int {
    return array.min()
}