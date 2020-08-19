package lesson4.classes

fun main() {
    val spice = SimpleSpice2("curry", "mild", 5)
    println("The spice name is ${spice.name}. It's ${spice.spiciness}. The heat level is ${spice.heat}")

    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val sortedByHeat = spices.filter { it.heat < 5 }


    sortedByHeat.forEach{
        println("The spice name is ${it.name}. It's ${it.spiciness}. The heat level is ${it.heat}")

    }

    makeSalt()
}