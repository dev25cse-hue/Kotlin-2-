class Employee {
    private var salary = 0.0

    fun setSalary(newSalary: Double) {
        if (newSalary > 0) {
            salary = newSalary
        }
    }

    fun getSalary(): Double {
        return salary
    }
}

fun main() {
    val emp = Employee()
    emp.setSalary(50000.0)

    println("Salary = ₹${emp.getSalary()}")
}
