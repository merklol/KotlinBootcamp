package lesson5.extensionfunctions

import lesson5.pairs.Book
import lesson5.pairs.getWeight

fun main() {
    val book = Book("War and Peace", "Leo Tolstoy", 1867, 900)
    val puppy = Puppy()
    while (book.pages > 0 ) puppy.playWithBook(book)
    println("The book's weight after the puppy played with it: ${book.getWeight()}")

}