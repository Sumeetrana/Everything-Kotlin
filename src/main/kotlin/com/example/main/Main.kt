package com.example.main

import kotlin.concurrent.thread

fun main() {
    println("Hello world 1")
    println("Hello world 2")
    println("Hello world 3")
    println("Hello world 4")
    println("Hello world 5")

    thread {
        Thread.sleep(5000)
        println("Thread 2 has finished.")
    }

    println("Hello world 6")
    println("Hello world 7")
    println("Hello world 8")
    println("Hello world 9")
}