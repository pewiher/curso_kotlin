package funciones

fun main() {
    val pricesArray = doubleArrayOf(5.0, 3.0, 2.0)
    println(getProductPrice(pricesArray, pricesArray.size - 1))
}

//(0.5, 0.3, 0.89)
fun getProductPrice(productPrice: DoubleArray, maxIndex: Int): Double {
    //Case Base
    if (maxIndex == 0) return productPrice[0]

    //Case Recursive
    return productPrice[maxIndex] + getProductPrice(productPrice, maxIndex.dec())
}