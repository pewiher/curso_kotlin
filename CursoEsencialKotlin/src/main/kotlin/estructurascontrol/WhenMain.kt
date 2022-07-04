package estructurascontrol

import kotlin.math.roundToInt

fun main() {
    val isLoggedIn = true
    val hasAddress = false
    when (isLoggedIn) {
        true -> println("Esta logeado")
        false -> println("No esta logeado")
    }

    println("====================")

    val userTime = 0
    val userValue = when (userTime) {
        1 -> "logout"
        in 10..20 -> "Usuario inactivo por $userTime"
        else -> "fuera"
    }

    println(userValue)

    val productPrice: Any = doubleArrayOf(15.99,11.10,45.99)
    val total = when (productPrice) {
        is DoubleArray -> productPrice.sum().roundToInt().toString()
        else -> productPrice
    }

    println("Total: $total")
}