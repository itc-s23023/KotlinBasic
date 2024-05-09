package org.example

fun main(args: Array<String>) {
    val a = 10
    val b = 10

    if (a==b) {
        println("a is b")
    } else if (a<b) {
        println("a is smaller than b")
    } else if (a>b) {
        println("a is larger than b")
    }

    val age: Int = 14
    var message = ""
    if (age in 13..15) {
        message = "中学生です"
    } else {
        message = "中学生ではないです"
    }
    println(message)


    val message2 = if (age in 13..15) {
        println("1")
        "中学生です"
    } else {
        println("2")
        "中学生ではありません"
    }
    println(message2)
}