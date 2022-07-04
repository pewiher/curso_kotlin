package funciones

fun main() {
    //Declarar
    val printHola =  {
        println("Hola lambda")
    }

    //Ejecutar
    printHola()

    val printText = { text: String ->
        println(text)
    }

    printText("Hola mundo como estan");

    val addOneTo = { x: Int ->
        x + 1
    }

    val total = addOneTo(20)
    println(total)


    val addFiveTo: (Int) -> Int = {
        it + 5
    }

    println(addFiveTo(1))

    val sum: (Int, Int, String) -> Int = { x: Int, y: Int, _: String ->
        x + y
    }

    println(sum(10, 20, ""))
}