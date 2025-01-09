package com.github.kboeckler.demo.kotlin

fun main() {
    val result = "Apfel".first().uppercase()
    println(result)

    (1..100)
        .filter { it % 2 == 0 }
        .map { it + 1 }
        .take(3)
        .forEach { println(it) }

    findAllUsers()
        .filter { it.activated }
        .map { it.name }
        .withIndex()
        .map { "${it.value}(${it.index})" }
        .joinToString(",")
        .let { println(it) }

}

fun findAllUsers(): List<User> {
    return listOf(User("Kevin", true), User("Peter", false), User("Lara", true))
}

fun someInts(): List<Int> {
    val list: MutableList<Int> = mutableListOf(1, 2)
    list.add(3)
    return list
}

data class User(val name: String, val activated: Boolean)
