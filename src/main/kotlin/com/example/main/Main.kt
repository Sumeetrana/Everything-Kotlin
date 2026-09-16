package com.example.main


fun main() {
    val myLambda = {a: Int, b: Int -> println(a+b)}
    myLambda(5,10)

    add(5, 10, {a: Int -> println(a+a)})


    val loginButton = Button("Login", 34345, object : OnClickListener {
        override fun onClick() {

        }
    })

    val signupButton = Button("Signup", 2345, object : OnClickListener {
        override fun onClick() {

        }
    })

    upperCase("hello", {s: String -> s.uppercase()})
    upperCase("hello"){it.uppercase()}
}

fun add(a: Int, b: Int, action: (Int) -> Unit) {
    action(a+b)
}

class Button(val text: String, val id: Int, val onClickListener: OnClickListener)

interface OnClickListener {
    fun onClick()
}

fun upperCase(str: String, myFunction: (String) -> String) {
    val uppercasedWord = myFunction(str)
    println(uppercasedWord)
}