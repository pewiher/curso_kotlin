package clasesyobjetos

fun main() {
    val firstSong = Song(
        title = "SOLO",
        artist = "Jennie"
    );

    val secondSong = Song(
        title = "Whistle",
        artist = "Blackpin"
    );

    val thirdSong = Song(
        title = "No roots",
        artist = "Alice Merton"
    );

    //Usando canciones
    secondSong.play()
    secondSong.stop();

    thirdSong.play();
}