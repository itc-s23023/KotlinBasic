package org.example

fun main(args: Array<String>) {
    var car = Ferrari("red")
    car.drive(5.0)
    car.drive(10.0)
}
open class Car(val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance = distance + d
        println("車が${distance}km走った")
        println("マイレージは${distance}kmです")
    }
}

class Ferrari(color: String) : Car(color)