package com.github.kboeckler.demo.kotlin

fun main() {
    val result = retrieveFromDb()
    println("There are ${result.amount} rows: ${result.rows}")
    val (amount, rows) = retrieveFromDb()
    println("There are $amount rows: $rows")

    val evenOrNot = listOf(1, 2, 3, 4, 5).partition { it % 2 == 0 } // of type Pair
    println(evenOrNot.first)
    println(evenOrNot.second)
    val (even, uneven) = listOf(1, 2, 3, 4, 5).partition { it % 2 == 0 }
    println(even)
    println(uneven)
}

fun retrieveFromDb(): DbResult {
    return DbResult(2, listOf("Kevin", "Max"))
}

data class DbResult(val amount: Int, val rows: List<String>)