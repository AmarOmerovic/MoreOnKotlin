package com.amaromerovic.moreonkotlin

fun main() {
    val months = listOf<String>("January", "February", "March")
//    val months = mutableListOf<String>("January", "February", "March")
    val additionalMonths = months.toMutableList()
    val anyTypes = listOf(1, 2, 3, true, false, "String")

    println(anyTypes.size)
    println("===============================================================================================")
    println(months[1])
    println("===============================================================================================")
    
    for (month in months) {
        println(month)
    }
    println("===============================================================================================")


    additionalMonths.add("April")
    for (month in additionalMonths) {
        println(month)
    }
    println("===============================================================================================")


    val newMonths = arrayOf("May", "June", "July")
    additionalMonths.addAll(newMonths)
    println("===============================================================================================")
    for (month in additionalMonths) {
        println(month)
    }

    additionalMonths.add("August")
    additionalMonths.add("September")
    additionalMonths.add("October")
    additionalMonths.add("November")
    additionalMonths.add("December")
    println("===============================================================================================")
    for (month in additionalMonths) {
        println(month)
    }

    additionalMonths[0] = "Amar"
    println("===============================================================================================")
    for (month in additionalMonths) {
        println(month)
    }

    additionalMonths.remove("November")
    println("===============================================================================================")
    for (month in additionalMonths) {
        println(month)
    }


    additionalMonths.removeAt(7)
    println("===============================================================================================")
    for (month in additionalMonths) {
        println(month)
    }

    additionalMonths.removeAll(months)
    println("===============================================================================================")
    for (month in additionalMonths) {
        println(month)
    }

    additionalMonths.removeAll(additionalMonths)
    println("===============================================================================================")
    for (month in additionalMonths) {
        println(month)
    }
}















