package lesson6

fun main() {
    val game = Game()
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()

    val numbers = listOf( 1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(numbers.divisibleBy {this % 3 })

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }
}

fun List<Int>.divisibleBy(block: Int.() -> Int): List<Int> {
    val res = mutableListOf<Int>()
    for (number in this) if(block(number) == 0) res.add(number)
    return res
}