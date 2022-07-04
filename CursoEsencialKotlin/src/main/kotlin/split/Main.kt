package split

fun main() {
    val superMarket = listOf(
        "Milk",
        "Egg",
        "Juice",
        "Rice",
        "Meat"
    )

    //n primero elementos
    val breakFast = superMarket
        .take(3)
        .filterNot {
            it == "Milk"
        }
    println(breakFast.joinToString())

    //n ultimos elementos
    val dinnerList = superMarket.drop(3)
    println(dinnerList.joinToString())
}