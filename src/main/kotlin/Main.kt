import javax.xml.crypto.Data

fun main() {
    val user1 = User("Alex", "Dobbin", 23)
    val user2 by lazy {
        User("Lazy", "Person", 10)
    }

    println(user2.firstName)
}

class User(var firstName: String, var lastName: String, var age: Int) {
    init {
        println("User: $firstName was created")
    }
}