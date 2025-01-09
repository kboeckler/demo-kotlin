package com.github.kboeckler.demo.kotlin

fun main() {
    // Class
    val cl = SomeClass(42)
    cl.printIt()

    val anotherCl = SomeClass()
    anotherCl.printIt()

    // Data class
    println(SomeClass(1) == SomeClass(1))
    println(SomeDataClass(1) == SomeDataClass(1))

    // Enum
    val en = SomeEnum.BLAU
    en.printIt()
    println(SomeEnum.BLAU == SomeEnum.BLAU)

    // Interface
    val impl = SomeImplementation() // of type SomeImplementation
    val impl2: SomeInterface = impl
    impl2.printIt()

    // Property
    val propertyObj = SomePropertyClass(1)
    propertyObj.zahl = 42
    println(propertyObj.zahl)
}

class SomeClass(zahl: Int) {

    constructor() : this(1)

    private val zahl: Int = zahl

    fun printIt() {
        println(zahl)
    }
}

data class SomeDataClass(val zahl: Int)

enum class SomeEnum() {
    ROT, GELB, BLAU;

    fun printIt() {
        println(this.ordinal)
    }
}

interface SomeInterface {
    fun printIt()
}

class SomeImplementation : SomeInterface {
    override fun printIt() {
        println("Hallo from Implementation")
    }
}

class SomePropertyClass(private var innerZahl: Int) {
    var zahl: Int
        get() {
            println("Getter called, returning $innerZahl")
            return innerZahl
        }
        set(value) {
            println("Setter called with value: $value")
            innerZahl = value
        }
}