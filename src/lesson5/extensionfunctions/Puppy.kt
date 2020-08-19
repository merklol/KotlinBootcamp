package lesson5.extensionfunctions

import lesson5.pairs.Book
import lesson5.pairs.tornPages
import kotlin.random.Random

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random.nextInt(50));
    }
}