package enums

import enums.constructor.Color
import enums.functions.ErrorType

fun main() {
    val conecctionType = ConecctionType.MOBILE
    println(conecctionType)

    val whiteHex = Color.WHITE.hexa
    println(whiteHex)

    val intentos = ErrorType.NOT_LOGGED_IN_ERROR.getRetryIntens()
    println(intentos)
}