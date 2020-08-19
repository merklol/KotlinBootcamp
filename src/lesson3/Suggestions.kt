package lesson3

fun main() {

    println("Enter your mood(happy/sad):")
    val mood : String = readLine()!!

    println(whatShouldIDoToday(mood, "sunny"))
    println(whatShouldIDoToday(mood, "rainy", 0))
    println(whatShouldIDoToday(mood, "rainy", 36))
    println(whatShouldIDoToday(mood, "sunny", 10))
}


fun whatShouldIDoToday(mood : String, weather : String, temperature : Int = 0) : String {
    return when {
        isHappy(mood) && isSunny(weather) -> "Go for a walk."
        !isHappy(mood) && !isSunny(weather) && isTooCold(temperature) -> "Stay in bed."
        isTooHot(temperature) -> "Go swimming."
        else -> "Stay home and read."
    }
}

fun isTooCold(temperature: Int) = temperature == 0
fun isTooHot(temperature: Int) = temperature > 35
fun isHappy(mood : String) = mood == "happy"
fun isSunny(weather: String) = weather == "sunny"