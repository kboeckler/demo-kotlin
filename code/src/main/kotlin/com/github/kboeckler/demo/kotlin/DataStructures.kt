package com.github.kboeckler.demo.kotlin

fun main() {
    // Array
    val array = intArrayOf(1, 2, 3) // of type IntArray
    var anotherArray = arrayOf(1, 2, 3) // of type Array<Int>
    println(array)
    println(anotherArray)

    // List
    val liste = listOf(1, 2, 3) // of type List<Int>
    println(liste)

    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)
    println(mutableList)

    // Map
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    map[4] = "four"
    val zero = map[0]
    val one = map[1]
    println(zero)
    println(one)

    // Pair
    val mengeObst = Pair(1, "Apfel")
    val andereMenge = 1 to "Apfel"
}