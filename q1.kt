class Car(val brand: String, val model: String, val price: Double)

fun main() {
    val car1 = Car("Toyota", "Fortuner", 4500000.0)
    val car2 = Car("Honda", "City", 1500000.0)
    val car3 = Car("BMW", "X5", 9500000.0)

    println("${car1.brand} ${car1.model} - ₹${car1.price}")
    println("${car2.brand} ${car2.model} - ₹${car2.price}")
    println("${car3.brand} ${car3.model} - ₹${car3.price}")
}