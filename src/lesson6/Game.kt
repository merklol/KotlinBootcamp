package lesson6

class Game {
    private val mutableList: MutableList<Directions> = mutableListOf(Directions.START)

    val north = { mutableList.add(Directions.NORTH)}
    val south = { mutableList.add(Directions.SOUTH)}
    val east = {  mutableList.add(Directions.EAST)}
    val west = {  mutableList.add(Directions.WEST)}
    val end = {
        mutableList.add(Directions.END)
        println("Game Over")
        println(mutableList)
        mutableList.clear()
        false
    }

    private fun move(where: () -> Boolean ) {
        where.invoke()
    }

    fun makeMove(str: String?) {
        when {
            str.equals("n") -> {
                move(north)
            }
            str.equals("s") -> {
                move(south)
            }
            str.equals("w") -> {
                move(west)
            }
            str.equals("e") -> {
                move(east)
            }
            else -> {
                move(end)
            }
        }
    }
}