package org.example

fun main(args: Array<String>) {

}

class Person4(val name: String, var age: Int) {
    init {
        println("Called secondary constructor's initializer")
        println("Called parameter is ${name} and ${age}")
    }
    constructor(age:Int) : this("Unknown", age)
}
