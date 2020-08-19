package lesson2

fun main() {
    val fishName = "Captain";

    when(fishName.length){
        0 -> println("Error!")
        in 3..12 -> println("Good fish name!")
        else -> println("OK fish name")
    }
}