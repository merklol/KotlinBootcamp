package lesson4.classes3

class Curry(name: String = "Curry", spiciness: String = "mild") : Spice(name, spiciness), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        TODO("Not yet implemented")
    }
}