package tipodatos

fun main() {
    // bytes -127 - 128
    val age: Byte = 20

    // Int 2 mil millones
    val productId  = 2147483747
    val productId2  = 2_147_483_747
    //val productId3:Int  = 2_147_483_747

    //Long
    //9 trillones 2^63
    val userId: Long = 9_223_372_036_854_775_807
    val userId2 = 9_223_372_036_854_775_807L

    //decimal
    // float 4 bytes 6-7 decimales
    // decimal 8 bytes 15-16 decimales
    val myDouble =  2.123456789112345678
    val myFloat = 2.12345678911234567F
    println(myDouble)
    println(myFloat)


    val isLoggedIn = true
    val hasAddress = false

    //and
    // 1 & 1 = 1
    // las demas false

    //or
    // cualquiera que sea true sera true


    //not
    // nega, si es true se vuelve false

    println(isLoggedIn && hasAddress)
    println(isLoggedIn.and(hasAddress))
    println(isLoggedIn and hasAddress)

    println(isLoggedIn || hasAddress)
    println(isLoggedIn.or(hasAddress))
    println(isLoggedIn or hasAddress)

    println(!isLoggedIn)
    println(isLoggedIn.not())

    //characters 2 bytes
    //sequece scape \t \b \n \r \' \" \\ \$
    val keyInserted = 'a'
    println(keyInserted)
    println('\$')
    println('\'')

}