package conversiondatos

fun main() {
    val productLowStock:Byte = 20
    val productStock:Int = productLowStock.toInt()
    println(productStock)

    val numberString = "1"
    val numberByte: Byte = numberString.toByte()
    println(numberByte)

    val numberDouble = numberString.toDouble()
    println(numberDouble)

    val unicodeInt = 0x2764
    val unicodeChar = unicodeInt.toChar()
    val unicode = unicodeChar.toString()
    println(unicode)

    val unicodeInt2 = 0x2661
    val unicodeChar2 = unicodeInt2.toChar()
    val unicode2 = unicodeChar2.toString()
    println(unicode2)
}