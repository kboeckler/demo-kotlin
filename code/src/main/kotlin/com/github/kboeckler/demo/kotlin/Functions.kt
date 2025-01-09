package com.github.kboeckler.demo.kotlin

fun main() {
    // Function
    val obj = SomeObject("Kevin")
    val objString = obj.greet()
    println(objString)

    // Extension Function
    val name = "Kevin"
    val objMessage = name.greet()
    println(objMessage)
    val modified = name.changeIt()
    println(modified)
    val sumOfChars = name.sum()
    println(sumOfChars)

    // Old way
    listOf(1, 2, 3)
        .stream()
        .map {}
        .toList()
    // Extension fun map on Iterable
    listOf(1, 2, 3)
        .map {}
        .toList()

    // Functions as type
    val numberFunction: (Int) -> Int
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

class SomeObject(private val innerString: String) {
    fun greet(): String {
        return "Hallo $innerString";
    }
}

fun String.greet(): String {
    return "Hallo $this"
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