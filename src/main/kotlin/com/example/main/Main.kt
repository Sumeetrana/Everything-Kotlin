package com.example.main

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Main program starts: ${Thread.currentThread().name}")

    val start = System.currentTimeMillis()

    val parentJob = CoroutineScope(Default).launch {
        val job1 = launch {
            val result1 = getData1(Thread.currentThread().name)
            println(result1)
        }
//        job1.join()
        val job2 = launch {
            val result2 = getData2(Thread.currentThread().name)
            println(result2)
        }
//        job2.join()
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