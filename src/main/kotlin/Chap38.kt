package org.example

fun main(args: Array<String>) {
    val c1 = getTextColosure("さん")
    val c2 = getTextColosure("くん")
    val c3 = getTextColosure("ちゃん")
    val name1 = c1("タケシ")
    val name2 = c2("タケシ")
    val name3 = c3("タケシ")
    println(name1)
    println(name2)
    println(name3)
}

fun getTextColosure(x:String): (String) -> String {
    var caller: (String) -> String = fun(name:String) = name + x
    return caller
}