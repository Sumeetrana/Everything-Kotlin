fun main() {
    val car1 = Car("Tesla", "S Plaid", "Red", 4)

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")

    car1.move(car1.name)
    car1.stop()
}

class Car(var name: String, var model: String, var color: String, var doors: Int) {
    fun move(carName: String) {
        println("The car $carName is moving")
    }

    fun stop() {
        println("The car has stopped")
    }


}