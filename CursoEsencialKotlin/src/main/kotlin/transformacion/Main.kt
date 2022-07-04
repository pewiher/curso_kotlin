package transformacion

fun main() {
    val languages = listOf(
        "C",
        "C++",
        "Java",
        "Kotlin"
    )

    // Languague: Java
    val strLanguages = languages.map {
        "Language: $it"
    }
    strLanguages.forEach {
        println(it)
    }


    // (Int) -> (String)
    val numbers = listOf(1, 2, 3)
    val items = numbers.map {
        "$it. Itemm"
    }

    println(items.joinToString())

    val data = listOf("1", "2", "*", "3", "/")
    val dataNumbers = data.mapNotNull {
        it?.toIntOrNull()
    }

    println(dataNumbers)
    val sum = dataNumbers.sum()
    println(sum)



}