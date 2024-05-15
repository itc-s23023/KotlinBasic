package org.example

import java.awt.SystemColor

fun main(args: Array<String>) {
    val list: List<String?> = listOf("A", null, "C", "D", "E", "F", "G", "H")
    for(text in list) {
        if(text != null) {
            println(text)
        }
    }
    for (text in list) {
        text?.let { println(it) }
    }
}