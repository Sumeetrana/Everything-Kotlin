package com.example.main

fun main() {
    val numbers = arrayOf(1,2,3,4)

    try {
        println(numbers[5])
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Out of range of bounds: ${e.message}")
    } finally {
        println("Access the element")
    }
}