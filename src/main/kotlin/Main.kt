import javax.xml.crypto.Data

fun main() {
    val car = Car("BMW", "Red", 1, 4)
    val plane = Plane("Airbus", "White", 4, 8)

    car.move()
    plane.move()
}

open class Vehicle(val name: String, val color: String)  {
    open fun move() {
        println("$name is moving")
    }

    open fun stop() {
        println("$name is stopped")
    }
}

class Car(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {

}

class Plane(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
    override fun move() {
        flying()
        super.move()
    }

    fun flying() {
        println("The plane is flying")
    }
}