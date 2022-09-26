package com.amaromerovic.moreonkotlin


fun main() {
//    val obj: Any? = null
//    val str: String = obj as String
//    println(str)

//    val obj: Any = 123
//    val str: String = obj as String
//    println(str)


    val obj: Any? = "String unsafe cast"
    val int: Int? = obj as? Int
    val str: String? = obj as? String
    int?.let { println(it) }
    str?.let { println(it) }

    println("\n=============================================================\n")

    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)

}