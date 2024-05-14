package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
//    print("1:グー　2:チョキ 3:パー　を選んでください:")
//    var player = readln().toInt()
    var i =0
    var win = 0
    var lose = 0
    var aiko = 0
    while (i < 100) {
        i++
        val randomValue = Random.nextInt(1, 100)
        when (randomValue) {
            in 0..10 -> win += 1
            in 11..95 -> lose += 1
            else -> aiko += 1
        }
    }
    println("勝ち: $win, 負け: $lose, あいこ: $aiko")

}