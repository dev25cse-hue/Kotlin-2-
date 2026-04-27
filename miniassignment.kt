class Book(val title: String, val author: String)

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun removeBook(title: String) {
        books.removeIf { it.title == title }
    }

    fun showBooks() {
        for (book in books) {
            println("${book.title} by ${book.author}")
        }
    }
}

fun main() {
    val library = Library()

    library.addBook(Book("Kotlin Basics", "John"))
    library.addBook(Book("OOP Concepts", "Smith"))

    library.showBooks()

    library.removeBook("Kotlin Basics")

    println("After Removing:")
    library.showBooks()
}