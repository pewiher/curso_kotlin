package getterandsetter

import java.time.LocalDate
import java.time.Month

fun main() {
    // User
    //  - email
    //  - password
    //  - birthdate
    //  - gender

    // register(user)
    val user = User(email = "PETER@GMAIL.COM", password = "123456")
    val userRegister: User? = RegisterUser().invoke(user)
    if (userRegister != null) {
        println("User Registered: ${userRegister.email}")
        println("User Registered: ${userRegister.password}")
    } else {
        println("No registrado")
    }

    println()

    val petUser = User(
        email = "peter@gmail.com",
        password = "123456",
        birthdate = LocalDate.of(1990, Month.DECEMBER, 25),
        gender = 'M'
    )

    val userPetRegister: User? = RegisterUser().invoke(petUser)
    if (userPetRegister != null) {
        println("User Registered: ${userPetRegister.email}")
        println("User Registered: ${userPetRegister.password}")
        println("User Registered: ${userPetRegister.birthdate}")
        println("User Registered: ${userPetRegister.gender}")
    } else {
        println("No registrado")
    }
}