package lesson2

fun main() {
    val numbers : Array<Int> = (11..15).toList().toTypedArray()
    val list : MutableList<String> = mutableListOf()

    for(number : Int in numbers) {
        list.add(number.toString())
    }

    val nList : MutableList<Int> = mutableListOf()
    for(it in 0..100) {
        if(it % 7 == 0) nList.add(it)
    }

    println(list)
    println(nList)
}