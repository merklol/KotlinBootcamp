package lesson5.pairs

const val MAX_NUM_BOOKS = 5

data class Book(val title: String, val author: String, val year: Int, var pages: Int){

    fun getPair(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getTriple(): Triple<String, String, Int>{
        return Triple(title, author, year)
    }

    fun canBorrow(hasBooks: Int): Boolean {
        return hasBooks < MAX_NUM_BOOKS
    }

    fun printUrl() {
        println("$BASE_URL/${title.replace(" ", "%").toLowerCase()}.html")
    }

    companion object {
        const val BASE_URL = "http://www.turtlecare.net/"
    }
}

fun Book.getWeight(): Double {
    return pages * 1.5;
}

fun Book.tornPages(torn: Int) {
    pages -= torn;
}