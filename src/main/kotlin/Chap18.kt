package org.example

fun main(args: Array<String>) {
    val x = mutableSetOf<String>("あ","い","う","え","お")
    x.add("あ")
    x.add("あ")
    x.add("あ")
    println(x)
    println(x.count())

    val x2 = mutableListOf<String>("あ","い","う","え","お")
    x2.add("あ")
    x2.add("あ")
    x2.add("あ")
    println(x2)
    println(x2.count())
}