package org.example

fun main(args: Array<String>) {
    val x = 5
    for(i in 1000 downTo 800 step 3) {
        println("${x}かける${i}は、${x*i}です")
    }
}