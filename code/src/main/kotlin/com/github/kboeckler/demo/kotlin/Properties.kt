package com.github.kboeckler.demo.kotlin

import kotlin.properties.Delegates

fun main() {
    // Property
    val lazyString by lazy {
        println("Jetzt erst einen Apfel draus gemacht")
        "Apfel"
    }
    var obsString by Delegates.observable("Ich bin ein leerer String") { prop, olr, new ->
        println("$olr -> $new")
    }
    println("Before calling delegated")
    println(lazyString)
    obsString = "Test"
    println(obsString)
    println("After calling delegates")
}