package org.example

fun main(args: Array<String>) {
    val x = 5
    var i =1000

    do {
        println("${x}かける${i}は、${x*i}です")
        i++
    } while (i <= 1001)
}