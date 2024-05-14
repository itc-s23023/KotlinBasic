package org.example



fun main(args: Array<String>) {
    val car = Ferrari2("red")
    car.drive(100.0)
}
open class Car2(val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance = distance + d
        println("車が${distance}km走った")
        println("マイレージは${distance}kmです")
    }
}

class Ferrari2(color: String) : Car2(color) {
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}色のフェラーリだ！")
        println("マイレージは${distance}だ")
    }
}