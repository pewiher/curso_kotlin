package dataclases

fun main() {
    val firtsSong = Song(
        "Solo",
        "Jennie"
    )

    val secondSong = Song(
        "Solo",
        "Jennie"
    )

    println("Are Classes song equals?: ${ firtsSong == secondSong}")

    println()
    val dataFirtsSong = Song(
        "Solo",
        "Jennie"
    )

    val dataSecondSong = Song(
        "Solo",
        "Jennie"
    )

    println("Are Data Classes song equals?: ${ dataFirtsSong == dataSecondSong}")
}

