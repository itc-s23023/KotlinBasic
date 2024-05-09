package org.example

fun main(args: Array<String>) {
    val x = "Hello"
    when (x) {
        "Good morning" -> println("おはようございます")
        "Hello" -> println("こんにちは")
        "Good Evening" -> println("こんばんは")
        else -> println("どうも")
    }

    val x2 = 2
    when (x2) {
        1,2 -> {
            println("its one or two")
            println("Hello")
        }
        3 -> {
            println("its three")
            println("Thank you!")
        }
        else -> {
            println("its not one two three")
            println("See you")
        }
    }

    val x3 = 3
    when {
        (x3==1 || x3==2) -> println("one or two")
        (x3==3) -> println("three")
        else -> println("other number excluding one two or three")
    }
}