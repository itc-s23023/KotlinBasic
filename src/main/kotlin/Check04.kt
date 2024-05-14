package org.example

fun main(args: Array<String>) {
    println(" 9 8 7 6 5 4 3 2 1")
    for (i in 9 downTo 1) {
        for (x in 1..9) {
            print("${i * x} ")
            if (x % 9 == 0) println("")
        }
    }
}