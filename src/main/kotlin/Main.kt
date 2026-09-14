import javax.xml.crypto.Data

fun main() {
    val user1 = User("Alex", "Dobbin", 23)
    val user2 = User("Alex", "Dobbin", 23)

    println(user1 == user2)
    println(user1)
}

//class User(var firstName: String, var lastName: String, var age: Int) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) {
//            return true
//        }
//
//        if(other is User) {
//            return this.firstName == other.firstName
//                    && this.lastName == other.lastName
//                    && this.age == other.age
//        }
//
//        return false
//    }
//
//    override fun hashCode(): Int {
//        return 0
//    }
//}

// Data class generates all of the code that we wrote above and many other useful code as well
data class User(var firstName: String, var lastName: String, var age: Int)