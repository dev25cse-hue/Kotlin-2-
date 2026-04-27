class Student(val name: String, val rollNumber: Int) {
    fun introduce() {
        println("My name is $name and my roll number is $rollNumber")
    }
}

fun main() {
    val student = Student("Dev", 101)
    student.introduce()
}