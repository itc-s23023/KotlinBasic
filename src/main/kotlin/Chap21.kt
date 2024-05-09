package org.example

fun main(args: Array<String>) {
    val answer: Int = getThreeTimes(5)
    val answer2 = getTimes(2,3)
    println(answer)
    println(answer2)
    printTimes(2,3)
    printTimes(5,10,20)
    printTimes(1,10,100,1000)
    printTimes(2,2,2,2,2,2,2,2)
}
fun getThreeTimes(value: Int) = value * 3

fun getTimes(x:Int , y:Int ) = x * y

fun printTimes(vararg numbers: Int) {
    var result = 1
    for (x in numbers) result *= x
    println(result)
}