package com.github.kboeckler.demo.kotlin

fun main() {
    findAllUsers()
        .filter { it.activated }
        .map { it.name }
        .take(3)
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