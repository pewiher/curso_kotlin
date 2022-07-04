package clasesyobjetos

class Song(
    val title: String,
    val artist: String,
) {
    val nameArtist = artist.uppercase()

    init {
        println("Song $title created")
    }

    fun play() {
        println("Playing $title - $nameArtist")
    }

    fun stop() {
        println("Stopped $title")
    }
}