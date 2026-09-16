package com.example.main

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Main program starts: ${Thread.currentThread().name}")

    val parentJob = CoroutineScope(Default).launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        delay(2000)
        println("Fake work finished: ${Thread.currentThread().name}")
    }

    runBlocking {
        parentJob.join()
    }


    println("Main program ends: ${Thread.currentThread().name}")


}
