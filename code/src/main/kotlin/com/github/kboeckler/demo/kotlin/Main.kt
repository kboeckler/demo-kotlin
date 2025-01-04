package com.github.kboeckler.demo.kotlin

fun main() {
    println("Hello from Kotlin")
    listOf(1, 2).filter { it % 2 == 0 }.first()
}
