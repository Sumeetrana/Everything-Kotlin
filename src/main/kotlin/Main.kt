fun main() {
    val user1 = User("Alex")
    val user2 = User("Smith", "Dobinca")

    println("Name = ${user1.firstName}")
    println("LastName = ${user1.lastName}")
    println("Age = ${user1.age}")

    println("\n")

    println("Name = ${user2.firstName}")
    println("LastName = ${user2.lastName}")
    println("Age = ${user2.age}")
}

class User(var firstName: String, var lastName: String, var age: Int) {
    constructor(firstName: String): this(firstName, "LastName", 0) {
    println("2nd")
    }

    constructor(firstName: String, lastName: String): this(firstName, lastName, 0) {
        println("3rd")
    }
}