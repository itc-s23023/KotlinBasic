package org.example

fun main(args: Array<String>) {
    val a: List<Int> = listOf(1000,2000,3000)
    println(a[0])
    println(a[1])
    println(a[2])

    for(money in a){
        println(money)
    }

    for((index, money) in a.withIndex()){
        println("${index+1}年目の時給は${money}です")
    }

    val b: MutableList<String> = mutableListOf("A","B","C")
    b.remove("A")
    for ((i,x) in b.withIndex()) println("${i} : ${x}")
}