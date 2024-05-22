fun main() {
    JudgeShape().judge()
}

abstract class Shape(val name: String) {
    abstract fun area(): Double
}

class JudgeShape {
    fun judge() {
        println("Select 1: Circle, 2: Rectangle")
        val n: String = readLine() ?: ""
        when (n) {
            "1" -> {
                val circle = Circle()
                PrintAnswer().answer(circle.name, circle.area())
            }
            "2" -> {
                val rectangle = Rectangle()
                PrintAnswer().answer(rectangle.name, rectangle.area())
            }
            else -> println("Type 1 or 2")
        }
    }
}

class PrintAnswer {
    fun answer(shapeName: String, ans: Double) {
        println("Shape:${shapeName} answer: ${ans}")
    }
}

class Circle(name: String = "Circle") : Shape(name) {
    override fun area(): Double {
        println("Type radius")
        val radius: Double = readLine()?.toDoubleOrNull() ?: 0.0
        return Math.PI * radius * radius
    }
}

class Rectangle(name: String = "Rectangle") : Shape(name) {
    override fun area(): Double {
        println("Type width")
        val width: Double = readLine()?.toDoubleOrNull() ?: 0.0
        println("Type height")
        val height: Double = readLine()?.toDoubleOrNull() ?: 0.0
        return width * height
    }
}