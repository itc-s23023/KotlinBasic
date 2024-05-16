package org.example

fun main(args: Array<String>) {
    val p = ::calculatePlus
    val m = ::calculateMinus
    printRandomValuesCaluclation(p)
    printRandomValuesCaluclation(m)
}
fun calculatePlus(x:Double, y:Double) = x + y
fun calculateMinus(x:Double, y:Double) = x - y
fun printRandomValuesCaluclation(calculator: (Double, Double) -> Double) {
    var x = Math.random()
    val y = Math.random()
    var result = calculator(x,y)
    println("$x $y is $result")
}