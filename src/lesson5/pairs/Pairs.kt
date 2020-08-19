package lesson5.pairs

fun main() {
    val book = Book("War and Peace", "Leo Tolstoy", 1867, 900)

    val pair: Pair<String, String> = book.getPair()
    val triple: Triple<String, String, Int> = book.getTriple()

    println("Here is your book ${pair.first} written by ${pair.second}.”")
    println("Here is your book ${triple.first} written by ${triple.second} in ${triple.third}.”")

    book.printUrl()
    println("Original book's weight: ${book.getWeight()}")

}