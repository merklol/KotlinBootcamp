package lesson3

fun main(){
    var fortune: String;
    for(i in 0..10) {
        fortune = getFortune(getBirthday());
        println("Your fortune is: $fortune")
        if(fortune.contains("Take it easy")) break;
    }
}

fun getBirthday() : Int {
    print("Enter your birthday: ")
    return readLine()?.toInt() ?: 1;
}

fun getFortune(birthday: Int) : String {
    val fortunes= listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    return when(birthday){
        28 -> "Your faith is uncertain."
        30 -> "Your faith is uncertain."
        else -> fortunes[ birthday % fortunes.size]
    }
}