package lesson3

import java.util.*

fun main() {
    dayOfWeek()
    dayOfWeek2()
}

fun dayOfWeek() = println("What day is it today?")

fun dayOfWeek2() {
    println("What day is it today?")
    val out = when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Unknown"
    }

    println(out)
}