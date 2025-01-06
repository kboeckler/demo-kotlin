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
}

class SomeClass(val zahl: Int) {

    constructor() : this(1)

    private val anotherZahl: Int = zahl * 2

    fun printIt() {
        println(zahl)
        println(anotherZahl)
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