package com.github.kboeckler.demo.kotlin

fun main() {
    // Function
    val obj = SomeObject()
    val objString = obj.asMyString()
    println(objString)

    // Extension Function
    val str = "Hallo Welt"
    val modified = str.changeIt()
    println(modified)

    str.sum()
    // Old way
    listOf(1, 2, 3).stream().map {}.toList()
    // Extension fun map on Iterable
    listOf(1, 2, 3).map {}.toList()

    // Functions as type
    val voidFunction: (String) -> Unit
    val firstFunction: (String) -> String
    val upperCaseFunction: (String) -> String
    voidFunction = ::doNothingReally
    firstFunction = ::takeFirstChar
    upperCaseFunction = ::upperCaseChar

    val result = upperCaseFunction(firstFunction("Apfel"))
    println(result)
    val result2 = upperCaseFunction.invoke(firstFunction.invoke("Birne"))
    println(result2)
}

class SomeObject {
    fun asMyString(): String {
        return "Test";
    }
}

fun String.changeIt(): String {
    return this.replace("Welt", "Kotlin")
}

fun String.sum(): Int {
    return this.map { it.code }.sum()
}

fun doNothingReally(input: String) {

}

fun takeFirstChar(input: String): String {
    return input.first().toString()
}

fun upperCaseChar(input: String): String {
    return input.uppercase()
}