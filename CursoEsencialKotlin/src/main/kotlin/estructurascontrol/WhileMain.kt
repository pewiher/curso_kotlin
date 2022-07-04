package estructurascontrol

fun main() {
    val greetings = arrayOf("hola", "hi2", "bienvenido" , "buenos dias", "hola", "hi")
    var i = 0;
    while (i < greetings.size) {
        println(greetings[i])
        i++
    }

    println("================")

    i = 0
    do {
        println(greetings[i])
        i++ //--i
    } while (greetings[i].length != 2 && i < greetings.size)

    println("La palabra es ${greetings[i]}")
}