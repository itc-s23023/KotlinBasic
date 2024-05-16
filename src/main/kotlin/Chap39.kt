package org.example

fun main(args: Array<String>) {
    val plus1: (Double, Double) -> Double = fun(x: Double, y: Double): Double {
        return x + y
    }
    val plus2: (Double,Double) -> Double = fun(x: Double, y: Double) = x + y
    val plus3: (Double, Double) -> Double = {x, y -> x + y}

    val result1 = plus1(10.0,2.0)
    val result2 = plus2(10.0,2.0)
    val result3 = plus3(10.0,2.0)

    println(result1)
    println(result2)
    println(result3)
}