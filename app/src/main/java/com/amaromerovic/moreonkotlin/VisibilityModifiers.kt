package com.amaromerovic.moreonkotlin

//PUBLIC MODIFIER
//public class Example {}
//class Demo {}
//
//public fun hello(){}
//fun demo(){}
//
//public val x = 5
//val y = 10


//PRIVATE MODIFIER
//public class Example {
//    private val x = 1
//
//    private fun doSomething() {
//
//    }
//}


//INTERNAL MODIFIER
//internal class Example {
//    internal val x = 5
//
//    internal fun getValue() {
//
//    }
//}
//
//internal val y = 10


//PROTECTED AND OPEN MODIFIER
//open class Base {
//    protected val i = 0
//}
//
//class Derived: Base() {
//    fun getValue():Int {
//        return i
//    }
//}


open class Base {
    protected open val i = 5
}

class Another: Base() {
    fun getValue(): Int {
        return i
    }
    override val i = 10
}
