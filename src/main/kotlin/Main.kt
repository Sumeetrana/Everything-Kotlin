fun main() {
    val user1 = User("Alex")
    val user2 = User("Smith", "Dobinca")
    val user3 = User()

    println("Name = ${user1.firstName}")
    println("LastName = ${user1.lastName}")
    println("Age = ${user1.age}")

    println("\n")

    println("Name = ${user2.firstName}")
    println("LastName = ${user2.lastName}")
    println("Age = ${user2.age}")

    println("\n")

    println("Name = ${user3.firstName}")
    println("LastName = ${user3.lastName}")
    println("Age = ${user3.age}")
}

class User(firstName: String = "FirstName", var lastName: String = "LastName", var age: Int = 0) {
    var firstName = firstName
        get() {
            return "Called getter $field"
        }

        set(value) {
            println("Called setter $field")
            field = value
        }
  }
}