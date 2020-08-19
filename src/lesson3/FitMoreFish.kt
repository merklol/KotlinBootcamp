package lesson3

fun main() {
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))

}


fun canAddFish(gallons : Double, currentFish : List<Int>, fishSize : Int = 2,
               hasDecorations: Boolean = true) : Boolean {
    return if(hasDecorations) fishSize <= ((gallons * 0.8) - currentFish.sum())
    else fishSize <= gallons - currentFish.sum()
}