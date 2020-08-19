package lesson3

fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val sorted = spices.sortedByDescending { it.length }

    val sorted2 = spices.filter {
        it.startsWith("c") && it.endsWith("e")
    }

    val sorted3 = spices.take(3).filter {
        it.startsWith("c")
    }

    println(sorted)
    println(sorted2)
    println(sorted3)
}