package org.example

fun main(args: Array<String>) {
    val delicious = true
    val cheap = true
    val letsEat = (delicious && cheap)
    println("食事する？ : $letsEat")
}