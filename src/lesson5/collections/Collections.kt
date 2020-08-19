package lesson5.collections

fun main() {
    val allBooks: Set<String> = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library: Map<String, Set<String>> = mapOf("Shakespeare" to allBooks)

    println(library.any { it.value.contains("Hamlet")})
    val moreBooks: MutableMap<String, String> = mutableMapOf("Wilhelm Tell" to "Schiller")

    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }

    println(moreBooks)
    println(moreBooks.getOrPut("JungleBook") { "Kipling" })
}