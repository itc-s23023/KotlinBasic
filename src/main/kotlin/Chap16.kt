package org.example

fun main(args: Array<String>) {
    val a: IntArray = intArrayOf(1000, 1200, 1500,2400, 3000, 3800)
    for ((index,money) in a.withIndex()) {
        println("${index+1}年の時給は　${money}円です")
    }
}