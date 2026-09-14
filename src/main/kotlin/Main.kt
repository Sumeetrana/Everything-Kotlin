import javax.xml.crypto.Data

fun main() {
//    println(Direction.EAST)
//    println(Direction.WEST)
//    println(Direction.NORTH)
//    println(Direction.SOUTH)

//    for(direction in Direction.values()) {
//        println(direction)
//    }

//    println(Direction.NORTH.direction)
//
//    Direction.NORTH.printData()

    val direction = Direction.EAST

    when(direction) {
        Direction.EAST -> println("The direction is EAST")
        Direction.WEST -> println("The direction is WEST")
        Direction.NORTH -> println("The direction is NORTH")
        Direction.SOUTH -> println("The direction is SOUTH")
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 5),
    EAST("east", 4),
    WEST("west", 3); // Notice the semicolon here, before declaring a function inside the enum class

    fun printData() {
        println("Direction = $direction and Distance = $distance")
    }
}