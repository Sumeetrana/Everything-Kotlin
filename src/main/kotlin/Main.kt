import javax.xml.crypto.Data

fun main() {

}

abstract class Vehicle() {
    abstract fun move()

    abstract fun stop()
}

class Car(var name: String, var color: String, val engines: Int, val doors: int): Vehicle() {
    override fun move() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }

}