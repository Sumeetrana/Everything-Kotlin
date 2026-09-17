package com.example.main

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Main program starts: ${Thread.currentThread().name}")

    val start = System.currentTimeMillis()

    val parentJob = CoroutineScope(Default).launch {
        val jobDeferred1 = async {
            getData1(Thread.currentThread().name)
        }
        val jobDeferred2 = async {
            getData2(Thread.currentThread().name)
        }
        println(jobDeferred1.await() + "\n${jobDeferred2.await()}")
    }

    runBlocking {
        parentJob.join()
    }

    println("Total time: ${System.currentTimeMillis() - start} ms")


    println("Main program ends: ${Thread.currentThread().name}")
}

private suspend fun getData1(threadName: String): String {
    println("Fake work1 starts: $threadName")
    delay(2000)
    println("Fake work1 finished: ${threadName}")
    return "Result 1"
}

private suspend fun getData2(threadName: String): String {
    println("Fake work2 starts: $threadName")
    delay(2000)
    println("Fake work2 finished: ${threadName}")
    return "Result 2"
}