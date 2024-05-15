package org.example

fun main(args: Array<String>) {
    val person = FlyingPerson("Takeshi", 5)
    var car = FlyingCar4("red")
    makeItFly(person)
    makeItFly(car)
}

fun makeItFly(a : Flyable) {
    a.fly()
}
interface Flyable {
    fun fly() {
        println("Something flying")
    }
}

open class Person5(val name: String, val age: Int)
class FlyingPerson(name: String, age: Int) : Person5(name, age), Flyable {
    override fun fly() {
        println("OMG!! The person is flying")
    }
}

open class Car4(val color :String)
class FlyingCar4(color:String) : Car4(color),Flyable {
    override fun fly() {
        println("OMG!! The car is flying")
    }
}