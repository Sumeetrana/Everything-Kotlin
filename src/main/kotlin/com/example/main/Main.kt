package com.example.main


fun main() {
//    val user = User().apply {
//        firstName = "Alex"
//        lastName = "Brian"
//        age = 20
//    }
//
//    with(user) {
//        println(firstName)
//        println(lastName)
//        println(age)
//    }

//    with(user) {
//        firstName = "Alex"
//        lastName = "Silverson"
//        age = 20
//    }

//    User("Alex", "Dobinca", 23).also {
//        println(it)
//    }

//    val text: String? = null
//
//    text?.let {
//        println(it)
//    }

    val user: User? = null

    user?.run {
        println(firstName)
        println(lastName)
        println(age)
    }
}

data class User(val firstName: String, val lastName: String, val age: Int)