package com.github.kboeckler.demo.kotlin

import kotlin.system.measureTimeMillis

fun main() {
    val neededTime = measureTimeMillis {
        val summe = (0..1000).map { it * it }.sum()
        println(summe)
    }
    println("Brauchte ${neededTime}ms")
}