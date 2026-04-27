open class Person(val name: String)

class Teacher(name: String) : Person(name) {
    fun teach() {
        println("$name is teaching")
    }
}

class Student(name: String) : Person(name) {
    fun study() {
        println("$name is studying")
    }
}

fun main() {
    val teacher = Teacher("Mr. Sharma")
    val student = Student("Dev")

    teacher.teach()
    student.study()
}