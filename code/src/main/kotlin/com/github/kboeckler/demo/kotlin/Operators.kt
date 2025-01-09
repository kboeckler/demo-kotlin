package com.github.kboeckler.demo.kotlin

fun main() {
    val here = MyVector(1, 3)
    val there = MyVector(5, 2)
    val delta = there - here

    println(MyVector(2, 2) == MyVector(2, 2))
}

class MyVector(val x: Int, val y: Int) {
    operator fun minus(other: MyVector): MyVector {
        return MyVector(x - other.x, y - other.y)
    }

    override operator fun equals(other: Any?): Boolean {
        if (other is MyVector) {
            return other.x == x && other.y == y
        }
        return false
    }
}