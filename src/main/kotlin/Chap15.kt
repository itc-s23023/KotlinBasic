package org.example


fun main(args: Array<String>) {
    var x = 0
    for (x in 1..5) {
        val value = (0..100).random()
        println("${x}回目の乱数：${value}")
        if (value < 10) break
    }
}