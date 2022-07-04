package funciones

fun main() {
    showWelcomeMessage("Hola")
    showWelcomeMessage(user = "Peter Herrera", text = "Hi")
    showWelcomeMessage("Welcome", "Peter")
}

fun showWelcomeMessage(text: String, user: String = "") {
    val mmessage = "$text $user".trim()
    println(mmessage)
}