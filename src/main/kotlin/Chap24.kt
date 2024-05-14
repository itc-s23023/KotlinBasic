package org.example

fun main(args: Array<String>) {
    val p = Person2()
    p.age = 30
    p.age = 25
    p.age = 80
    p.age = 10
}

class Person2 {
    var age: Int = 20
        set(value) {
            print("${field}歳から${value}歳になりました")
            if (value<field) println(" ->　若返った！")
            else if (value>field) println(" ->　年をとった！")
            field = value
        }
}