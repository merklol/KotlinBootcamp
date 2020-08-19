package lesson3

import kotlin.random.Random

fun main() {
    gamePlay(rollDice(0))
}
val rollDice: (Int) -> Int = { sides: Int ->
    if(sides == 0) 0
    else Random.nextInt(1, 12)
}

fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}