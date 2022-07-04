package arrays

fun main() {
    //Saludo
    val greetings = arrayOf("hola", "hi", "bienvenido" , "buenos dias", "hola")
    val introductions = arrayOf("Mi nombre es", "puedes llevarme", "usualmente me llaman", "yo soy")
    var names = arrayOf("Anahi", "Ann", "anncode", "Ani", "Irene")

    val randIndexGreeting = (Math.random() * greetings.size).toInt()
    val randIndexIntroduction = (Math.random() * introductions.size).toInt()
    val randIndexNames = (Math.random() * names.size).toInt()

    val frase = "${greetings[randIndexGreeting]} ${introductions[randIndexIntroduction]} ${names[randIndexNames]}"
    println(frase)
    println(Math.random())
}