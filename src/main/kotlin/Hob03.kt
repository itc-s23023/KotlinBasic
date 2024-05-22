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
                    "1" -> createShape("Circle")
                    "2" -> createShape("Rectangle")
                }
                break
            } else {
                println("Its a invalid input. Please type 1 or 2")
            }

        }
    }

    private fun createShape(shapeType: String) {
        when (shapeType) {
            "Circle" -> {
                val radius = getDoubleInput("radius")
                val circle = Circle(radius)
                printAnswer(circle)
            }
            "Rectangle" -> {
                val width = getDoubleInput("width")
                val height = getDoubleInput("height")
                val rectangle = Rectangle(width, height)
                printAnswer(rectangle)
            }
        }
    }

    }

    private fun getDoubleInput(valueName: String): Double {
        while (true) {
            println("Type $valueName")
            val input = readLine()
            val doubleValue = input?.toDoubleOrNull()
            if (doubleValue != null) {
                return doubleValue
            } else {
                println("Invalid input. Please enter a valid $valueName.")
            }
        }
    }
    private fun printAnswer(shape: Shape) {
        println("Shape: ${shape.name}, Area: ${shape.area()}")
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