fun main() {
    val user = User("Alex", "Dobbin", 23)

    user.favoriteMovie = "Interstellar"
    println(user.favoriteMovie)
}

class User(firstName: String = "FirstName", var lastName: String = "LastName", var age: Int = 0) {
    lateinit var favoriteMovie: String
}