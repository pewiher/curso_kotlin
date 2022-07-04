package iteration

fun main() {
    println("LIST")

    val list = listOf(1, 2, 3)
    println(list[0])

    list.forEach {
        println(it)
    }

    println("SET")

    val set =  setOf<Int>(1, 1, 5, 5, 2, 3, 4)
    println(set.size)
    set.forEach {
        println(it)
    }

    val setNames = setOf("Peter", "Anna", "Anna", "peter")
    setNames.forEach {
        println(it)
    }
    println("MAP")

    val map = mapOf(
        1 to "Peter",
        2 to "Anna",
        3 to "Herrera",
    )

    map.forEach {
        println("${it.key}: ${it.value}")
    }
}