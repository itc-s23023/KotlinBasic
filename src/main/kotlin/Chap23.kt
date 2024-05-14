package org.example

fun main(args: Array<String>) {
    val p = Person()
    p.name = "Takesi"
    p.age = 20

    val p2 = Person()
    p2.name = "Mike"
    p2.age = 23

    val p3 = Person()
    p3.name = "Okamura"
    p3.age = 24


    p.greet()
    p2.greet()
    p3.greet()
}

class Person {
    var name =""
    var age = 0
    fun greet() {
        println("Hello, My name is ${name} and I am ${age} years old.")
    }
}