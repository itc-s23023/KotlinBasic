package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
//    var answer = ""
    print("1:グー　2:チョキ 3:パー　を選んでください:")
    var player = readln().toInt() - 1

    val cpu = Random.nextInt(0, 3)


    when (player) {
        0 -> {
            if (cpu == 0) println("あいこ")
            else if (cpu == 1) println("勝ち")
            else println("負け")
        }
        1 -> {
            if (cpu == 0) println("負け")
            else if (cpu ==1) println("あいこ")
            else println("勝ち")
        }
        else -> {
            if (cpu == 0) println("勝ち")
            else if (cpu == 1) println("負け")
            else println("あいこ")
        }
    }

//    if (player == 0) {
//        if (cpu == 0) {
//            answer = "あいこ"
//        }else if (cpu == 1) {
//            answer = "勝ち"
//        } else {
//            answer = "負け"
//        }
//    }else if (player == 1) {
//        if (cpu == 0) {
//            answer = "負け"
//        } else if (cpu == 1) {
//            answer = "あいこ"
//        } else {
//            answer = "勝ち"
//        }
//    } else{
//        if (cpu == 0) {
//            answer = "勝ち"
//        } else if (cpu == 1) {
//            answer = "負け"
//        } else {
//            answer = "あいこ"
//        }
//    }
//    println(answer)
}