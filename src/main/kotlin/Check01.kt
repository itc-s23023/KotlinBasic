package org.example

fun main(args: Array<String>) {
    val score = readLine()!!.toInt()
    if (score <= 59) {
        println("D")
    }
    else if (score <= 69) {
        println("C")
    }
    else if (score <= 79) {
        println("B")
    }
    else if (score <= 89) {
        println("A")
    }
    else {
        println("S")
    }
}