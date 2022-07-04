package funciones

fun main() {
    val result = isValid(5) {
        it > 10
    }

    consultProduct(getOnNextProductIdBehavior())

    println(result)
}

fun isValid(x: Int, validate: (x: Int) -> Boolean): Boolean = validate(x)

fun consultProduct(onNext: (productId: String) -> Unit) {
    val productId = "WR001"
    onNext(productId)
}

fun getOnNextProductIdBehavior(): (productId: String) -> Unit {
    return {
        println("Go to prudct detail screen with product id: $it")
    }
}