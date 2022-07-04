package estructurascontrol

import kotlin.system.measureNanoTime

fun main() {
    val forInRange = measureNanoTime {
        for (i in 0..1000) {
            i
        }
    }

    val foreachInRange = measureNanoTime {
        (0 .. 1000).forEach { it }
    }

    println(forInRange)
    println(foreachInRange)


    println()
    val objectList = (0..1000).toList()

    val forInListRange = measureNanoTime {
        for (i in objectList) {
            i
        }
    }



    val foreachInListRange = measureNanoTime {
        objectList.forEach { it }
    }

    println("forInListRange: $forInListRange")
    println("foreachInListRange: $foreachInListRange")

}