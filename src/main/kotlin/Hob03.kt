fun main() {
    JudgeShape().judge()
}

abstract class Shape(val name: String) {
    abstract fun area(): Double
}

class JudgeShape {
    fun judge() {
        while(true) {
            println("Select 1: Circle, 2: Rectangle")
            val n: String? = readLine()
            if (n != null && (n == "1" || n == "2")) {
                when (n) {
                    "1" -> createCircle()
                    "2" -> createRectangle()
                }
                break
            } else {
                println("Type 1 or 2")
            }

        }
    }

    private fun createCircle() {
        val radius = getDoubleInput("radius")
        val circle = Circle(radius)
        PrintAnswer().answer(circle.name, circle.area())
    }
    private fun createRectangle() {
        val width = getDoubleInput("width")
        val height = getDoubleInput("height")
        val rectangle = Rectangle(width,height)
        PrintAnswer().answer(rectangle.name, rectangle.area())
    }
    private fun getDoubleInput(value: String): Double {
        while (true) {
            println("Type $value")
            val input = readLine()
            val doubleValue = input?.toDoubleOrNull()
            if (doubleValue != null) {
                return doubleValue
            } else {
                println("Invalid input. Please enter a valid value.")
            }
        }
    }
}

class PrintAnswer {
    fun answer(shapeName: String, ans: Double) {
        println("Shape:${shapeName} answer: ${ans}")
    }
}

class Circle(val radius: Double) : Shape("Circle") {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(val width: Double, val height: Double) : Shape("Rectangle") {
    override fun area(): Double {
        return width * height
    }
}