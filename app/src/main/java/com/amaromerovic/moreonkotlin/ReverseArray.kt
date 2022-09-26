package com.amaromerovic.moreonkotlin

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    reverse(array)
}

fun reverse(array: IntArray) {
    array.reverse()
    println(array.contentToString())
}