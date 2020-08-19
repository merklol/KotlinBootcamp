package lesson2

fun main() {
    var color = "red"
    color = "blue"
    val secondColor = "black"

    //val cannot be reassign
    //secondColor = "white"


    //Nullability
    var someColor = null
    var anotherColor: Int? = null

    //Nullability/Lists
    listOf(null,null)
    var list: List<Int?> = listOf(null, null)
    var list2:List<Int>? = null

    //Null Checks
    var nullTest: Int? = null
    println(nullTest?.inc() ?:0)

    //String template
    val fish1 = "trout"
    val fish2 = "haddock"
    val fish3 = "snapper"

    println("I like to eat $fish3 and $fish2, but I don't like to eat $fish1")



}