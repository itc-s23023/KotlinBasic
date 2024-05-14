package org.example

fun main(args: Array<String>) {
    val p = Person4(9)
}

class Person4(val name: String, var age: Int) {
    init {
        println("Called secondary constructor's initializer")
        println("Called parameter is ${name} and ${age}")
    }
    constructor(age:Int) : this("Unknown", age) {
        println("Called secondary constructor's initializer that only select age")
    }
}
