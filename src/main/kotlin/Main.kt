fun main() {
    val user1 = User("Alex", "Dobinca", 23)
    val user2 = User("Smith", "Dobinca", 23)

    println("User1: ${user1.firstName}")
    println("User2: ${user2.firstName}")
}

class User(var firstName: String, var lastName: String, var age: Int) {
    init {
        if(!firstName.lowercase().startsWith("a")) {
            firstName = "User"
            println("The name doesn't start with the letter 'a' or 'A'")
        }
    }
}