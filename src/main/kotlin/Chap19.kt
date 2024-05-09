package org.example

fun main(args: Array<String>) {
    val map: MutableMap<String, String> = mutableMapOf("Pen" to "ペン")
    map.put("Apple","アップル")
    map.put("Pineapple","パイナップル")
    val value1 = map.getOrDefault("Pen","Nokey and Novalue")
    val value2 = map.getOrDefault("Pineapple","Nokey and Novalue")
    val value3 = map.getOrDefault("Apple","Nokey and Novalue")
    map.remove("Pen")
    val value4 = map.getOrDefault("Pen","Nokey and Novalue")
    println("${value1},${value2},${value3},${value4}")
}