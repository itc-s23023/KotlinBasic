fun main(args: Array<String>) {
    val dog = Dog(color = "red")
    val cat = Cat("mike")
    dog.makeSound()
    println(dog.name)
    cat.makeSound()

}

abstract class Animal(val name: String) {
    open fun makeSound() {
        // println("Animal is making sound")
    }
}

open class Dog(name: String = "Unknown", color: String) : Animal(name) {
    override fun makeSound() {
        println("wanwan")
    }
}

open class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("nyaaaaa")
    }
}