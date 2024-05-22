data class Book(
    val title: String,
    val author: String,
    val year: Int,
    val isbn: String,
    var isBorrowed: Boolean = false
) {
    fun borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true
            println("$title has been borrowed.")
        } else {
            println("$title is already borrowed.")
        }
    }

    fun returnBook() {
        if (isBorrowed) {
            isBorrowed = false
            println("$title has been returned.")
        } else {
            println("$title was not borrowed.")
        }
    }
}

class Library {
    private val books: MutableList<Book> = mutableListOf()

    fun addBook(book: Book) {
        books.add(book)
        println("${book.title} has been added to the library.")
    }

    fun removeBook(isbn: String) {
        val book = books.find { it.isbn == isbn }
        if (book != null) {
            books.remove(book)
            println("${book.title} has been removed from the library.")
        } else {
            println("Book with ISBN $isbn not found.")
        }
    }

    fun findBookByTitle(title: String): List<Book> {
        return books.filter { it.title.contains(title, ignoreCase = true) }
    }

    fun findBookByAuthor(author: String): List<Book> {
        return books.filter { it.author.contains(author, ignoreCase = true) }
    }

    fun listAllBooks() {
        if (books.isEmpty()) {
            println("The library has no books.")
        } else {
            books.forEach { println(it) }
        }
    }

    fun listAvailableBooks() {
        val availableBooks = books.filter { !it.isBorrowed }
        if (availableBooks.isEmpty()) {
            println("No available books at the moment.")
        } else {
            availableBooks.forEach { println(it) }
        }
    }
}

fun main() {
    val library = Library()

    val book1 = Book("Kotlin Programming", "John Doe", 2020, "1234567890")
    val book2 = Book("Advanced Kotlin", "Jane Doe", 2021, "0987654321")

    library.addBook(book1)
    library.addBook(book2)

    library.listAllBooks()
    println()

    library.findBookByTitle("Kotlin").forEach { println(it) }
    println()

    book1.borrowBook()
    library.listAvailableBooks()
    println()

    book1.returnBook()
    library.listAvailableBooks()
}
