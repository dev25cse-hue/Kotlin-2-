interface Shape {
    fun area(): Double
}

class Circle(val radius: Double) : Shape {
    override fun area(): Double {
        return 3.14 * radius * radius
    }
}

class Rectangle(val length: Double, val breadth: Double) : Shape {
    override fun area(): Double {
        return length * breadth
    }
}

fun main() {
    val circle = Circle(7.0)
    val rect = Rectangle(8.0, 4.0)

    println("Circle Area = ${circle.area()}")
    println("Rectangle Area = ${rect.area()}")
}