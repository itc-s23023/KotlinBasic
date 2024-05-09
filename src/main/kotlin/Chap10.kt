package org.example

fun main(args: Array<String>) {
    val age: Int = 10
    val range1: IntRange = 0..6
    val range2: IntRange = 7..12
    val range3: IntRange = 13..15
    val flag1 = age !in range1
    val flag2 = age !in range2
    val flag3 = age !in range3

    println("${age}歳の子供は就学前　${flag1}")
    println("${age}歳の子供は小学生　${flag2}")
    println("${age}歳の子供は中学生　${flag3}")


    val range_a: LongRange = 0..100000000L
    val range_b: CharRange = 'A'..'E'
    val range_c: CharRange = 'あ'..'お'

    val flag_a = 500 in range_a
    val flag_b = 'D' in range_b
    val flag_c = 'え' in range_c


    println("flag_a = ${flag_a}")
    println("flag_b = ${flag_b}")
    println("flag_c = ${flag_c}")
}