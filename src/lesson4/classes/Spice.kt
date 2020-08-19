package lesson4.classes

class Spice(val name: String, val spiciness: String = "mild"){

    val heat : Int
        get() {
            return when(spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        println("The spice name is $name. It's $spiciness. The heat level is $heat")
    }
}

fun makeSalt() : Spice {
    return Spice(name = "salt", spiciness = "none")
}
