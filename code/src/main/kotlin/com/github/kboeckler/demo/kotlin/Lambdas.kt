package com.github.kboeckler.demo.kotlin

fun main() {
    // Function as parameter
    doWithInterface(2, IncFunc())

    doWith(2, SquareFuncClass())
    doWith(2, ::cubeIt)

    // Lambda as function
    doWith(2, { number -> number - 1 })
    doWith(2, { it - 1 })
    doWith(2) { it - 1 }
}

fun doWith(number: Int, numberFunction: (Int) -> Int) {
    val result = numberFunction.invoke(number)
    println(result)
}

class SquareFuncClass : (Int) -> Int {
    override fun invoke(p1: Int): Int {
        return p1 * p1
    }
}

fun cubeIt(number: Int): Int {
    return number * number * number
}

interface NumberFuncInterface {
    fun numberFunc(number: Int): Int
}

fun doWithInterface(number: Int, funcIface: NumberFuncInterface) {
    val result = funcIface.numberFunc(number)
    println(result)
}

class IncFunc : NumberFuncInterface {
    override fun numberFunc(number: Int): Int {
        return number + 1
    }
}