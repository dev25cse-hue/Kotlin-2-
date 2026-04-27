interface Playable {
    fun play()
}

class Cricket : Playable {
    override fun play() {
        println("Playing Cricket")
    }
}

class Football : Playable {
    override fun play() {
        println("Playing Football")
    }
}

fun main() {
    val c = Cricket()
    val f = Football()

    c.play()
    f.play()
}