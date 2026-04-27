open class Shape {
    open fun area() {
        println("Area calculation")
    }
}

class Circle : Shape() {
    override fun area() {
        println("Circle Area")
    }
}

class Rectangle : Shape() {
    override fun area() {
        println("Rectangle Area")
    }
}

fun main() {
    val shapes: List<Shape> = listOf(Circle(), Rectangle())

    for (shape in shapes) {
        shape.area()
    }
}