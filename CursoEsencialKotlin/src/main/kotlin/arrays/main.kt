package arrays

fun main() {
    val myArray = arrayOf(1, "hola", 2.5F, 1000L, 'c', true)
    println(myArray[1])
    myArray[1] = "adios"
    println(myArray[1])

    val emptyArray = emptyArray<Int>()
    val myByteArray = byteArrayOf(1,2,3,4,5)
    val myIntArray = intArrayOf(100,200,300,400)
    val arrayInt = IntArray(5)
    val arrayInt2 = IntArray(5) { i: Int -> i.inc() }
    arrayInt2.forEach {
        println(it)
    }

    val arrayBoolean = BooleanArray(3) {
        println(it)
        true
    }

    arrayBoolean.forEach {
        println(it)
    }
}