package iteration

fun main() {
    println("MUTABLE LIST")
    val list = listOf(1, 2, 3)
    val anotherList = list.toMutableList()

    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)
    //mutableList.addAll(anotherList)
    mutableList[0] = 5
    mutableList.removeAt(0)

    mutableList.forEach {
        println(it)
    }

    println("MUTABLE SET")
    val mutableSet = mutableSetOf(1, 2, 2, 3)
    mutableSet.forEach {
        println(it)
    }

    println("MUTABLE MAP")
    val mutableMap = mutableMapOf(
        1 to "a",
        2 to "b"
    )

    //mutableMap.put(3, "c")
    mutableMap[3] = "c"

    mutableMap.forEach {
        println("${it.key} : ${it.value}")
    }


}