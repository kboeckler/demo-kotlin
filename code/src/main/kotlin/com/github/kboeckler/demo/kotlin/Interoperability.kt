package com.github.kboeckler.demo.kotlin

import java.util.*

fun main() {
    val jstr: Optional<String> = InteropabilityJ().theString
    val kstr: String? = jstr.orElse(null)
    val kstrMitExtension: String? = jstr.unwrap()
    println(jstr)
    println(kstr)
    println(kstrMitExtension)

    val kotlinClass = InteropabilityJ::class.java
    val javaClass = InteropabilityJ::class
}

fun <T> Optional<T>.unwrap(): T? = orElse(null)
