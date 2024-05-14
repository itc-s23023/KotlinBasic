package org.example


fun main(args: Array<String>) {
    val p = Person3("Tanaka",20)
}
class Person3 (var name: String = "Unknown", var age: Int = 0) {
    init {
        println("Called initializer")
        greet()
    }
    fun greet() {
        println("Hello, Im $name, $age years old")
    }

}