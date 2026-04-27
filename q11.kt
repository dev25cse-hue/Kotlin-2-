open class Animal {
    open fun makeSound() {
        println("Animal sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Woof")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Meow")
    }
}

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat())

    for (animal in animals) {
        animal.makeSound()
    }
}