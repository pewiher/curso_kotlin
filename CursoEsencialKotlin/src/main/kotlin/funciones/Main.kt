package funciones

fun main() {
    // "My fabulous app"
    // "Welcome to the best experience"
    // "Peter Herrera"

    // "**** My fabulous app ****"
    // "*** Welcome to the best experience ***"
    // "* Peter Herrera *"

    val appName = StringBuilder("My fabulous app")
    val welcome = StringBuilder("Welcome to the best experience")
    val name = StringBuilder("Peter Herrera")

    println(addStartsFormat(appName, 4))
    println(addStartsFormat(welcome, 3))
    println(addStartsFormat(name, 1))
}

fun addStartsFormat(text:StringBuilder, startsNumber: Int): String {
    text.insert(0, " ")
    text.insert(text.length, " ")
    for (i in 0 until startsNumber) {
        text.insert(0, "*")
        text.insert(text.length, "*")
    }
    return text.toString()
}

fun addStartsFormat(text: String): String = addStartsFormat(StringBuilder(text), 5)