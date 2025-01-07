package com.github.kboeckler.demo.kotlin

fun main() {
    // TODO Streams
    (1..100)
        .filter { it % 2 == 0 }
        .map { it + 1 }
        .take(3)
        .forEach { println(it) }
}