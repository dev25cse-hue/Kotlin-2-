class BankAccount {
    private var balance = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) balance += amount
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
        } else {
            println("Insufficient Balance")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount()

    account.deposit(5000.0)
    account.withdraw(2000.0)

    println("Balance = ₹${account.getBalance()}")
}