package lesson4.classes2

open class Book(val author: String, val title: String){
    private var currentPage: Int = 1

    open fun readPage() {
        currentPage += 1
    }
}