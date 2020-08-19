package lesson4.classes3

fun main() {
    val curry = Curry()
    val spiceContainer = SpiceContainer(curry.name)
    println(spiceContainer.label)
}