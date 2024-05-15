package org.example

fun main(args: Array<String>) {
    val number = 123
    val text = "aiueo"
    val car = Car5("red")
    val person = Person6("Kenzi", 5)
    printClassInfo(number)
    printClassInfo(text)
    printClassInfo(car)
    printClassInfo(person)

}

fun printClassInfo (obj: Any) {
    val hashcode = obj.hashCode()
    val text = obj.toString()
    println("テキスト= ${text}, ハッシュコード= ${hashcode}")
    if (obj is Person6) {
        println("↑　これは、Personクラスのインスタンスですね")
        obj.greet()
    } else if(obj is Car5) {
        println("↑　これは、Carクラスのインスタンスですね")
        obj.drive(100.0)
    }
}

class Car5 (val color: String) {
    fun drive (d : Double) {
        println("${color}の車が${d}km走りました")
    }
}

class Person6 (val name: String, val age: Int) {
    fun greet() {
        println("My name is $name, I am $age years old")
    }
}