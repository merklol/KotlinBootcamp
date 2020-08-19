package lesson4.classes2

class EBook(author: String, title: String, var format: String = "text") : Book(author, title) {
    private var wordCounter : Int = 0
    override fun readPage() {
        wordCounter += 250
    }
}