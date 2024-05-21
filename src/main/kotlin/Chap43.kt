fun main(args: Array<String>) {
    val car7 = Prius("red")
    car7.drive()
}

open class Car4(val color: String) {
    protected var fuel = 50.0
    public fun drive() {
        if(fuel > 0.0) {
            letEngineWork()
            println("${color} car drive")
        } else {
            println("no fuel")
        }
    }
    open fun letEngineWork() {
        println("booom")
        fuel -= 1.0
    }
}

class Prius(color: String) : Car4(color) {
    override fun letEngineWork() {
        println("sooon")
        fuel -= 0.5
    }
}