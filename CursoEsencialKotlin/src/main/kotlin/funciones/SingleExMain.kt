package funciones

fun main() {
    val welcome = getWelcomeText()
    println(welcome)
    println(clearTest(welcome))

}

fun getWelcomeText(): String = "** Welcome to the best experience **"

fun clearTest(text: String) : String = text
    .removePrefix("**")
    .removeSuffix("**")
    .trim()