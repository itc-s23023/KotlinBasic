package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
    print("1:グー　2:チョキ 3:パー　を選んでください:")
    var player = readln().toInt()
    val randomValue = Random.nextInt(1, 100)
    var result = when(randomValue) {
        in 0..10 -> "勝ち"
        in 11..85 -> "負け"
        else -> "あいこ"
    }
    println(result)

}