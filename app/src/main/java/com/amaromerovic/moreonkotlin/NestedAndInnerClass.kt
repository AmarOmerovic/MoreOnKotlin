package com.amaromerovic.moreonkotlin

fun main() {
    println(OuterClass.NestedClass().description)
    val nestedClass = OuterClass.NestedClass()
    nestedClass.foo()

    println("\n=======================================================================\n")
    println(OuterClassTwo().InnerClass().description)
    val innerClass = OuterClassTwo().InnerClass()
    innerClass.foo()
}

//NESTED CLASS
class OuterClass {
    private var name = "Mr X"

    class NestedClass {
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo() {
//            println("name is $name")
            println("id is $id")
        }
    }
}


// INNER CLASS
class OuterClassTwo {
    private var name: String = "Mr X"

    inner class InnerClass {
        var description: String = "code inside inner class"
        private var id: Int = 101

        fun foo() {
            println("name is $name")
            println("ID is $id")
        }
    }
}

