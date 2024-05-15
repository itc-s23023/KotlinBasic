package org.example

fun main(args: Array<String>) {
    val car3 = Ferrari2("red")
    car3.drive(100.0)

}
open class Car3(val color: String) {
    var distance = 0.0
    open fun drive2(d: Double) {
        distance = distance + d
        println("${color} car driving  ${d} km")
        println("Mileage reached $distance km")
    }
}