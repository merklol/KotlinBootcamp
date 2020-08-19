package lesson4.classes3

abstract class Spice(val name: String, val spiciness: String = "mild") : SpiceColor by YellowSpiceColor {

    abstract fun prepareSpice()

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