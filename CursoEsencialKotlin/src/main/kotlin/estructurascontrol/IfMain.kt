package estructurascontrol

fun main() {
    val isLoggedIn = true
    val hasAddress = false
    val address = arrayOf("Ecuador", "Mexico", "Peru")
    if (isLoggedIn) {
        if (hasAddress) {
            address.forEach {
                println(it)
            }
        } else {
            println("El usuario no tiene direcciones")
        }
    } else {
        println("Usuario no logeado")
    }

    val user = if (isLoggedIn) "Usuario logeado" else "Usuario no logeado"
    println(user)
}