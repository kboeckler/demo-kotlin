package com.github.kboeckler.demo.kotlin

fun main() {
    // Type with ?
    var name: String
    name = "Kevin" // of type String
    //name = null
    val nameOrNot: String? = null // of type String?
    val anotherNameOrNot: String? = "Kevin" // of type String?

    // Elvis operator
    val myName: String = nameOrNot ?: "Max Mustermann"
    println(myName)
    val anotherMyName: String = anotherNameOrNot ?: "Max Mustermann"
    println(anotherMyName)

    // Chaining with ?
    val person = Person(Name("Kevin", "Böckler"))
    println(person.name?.vorname)
    val personWithoutName = Person(null)
    println(personWithoutName.name?.vorname)
    val vorname: String = personWithoutName.name?.vorname ?: "Max"
    println(vorname)

    // Let
    person.name?.let { personName ->
        println(personName)
    }
}

data class Person(val name: Name?)

data class Name(val vorname: String, val nachname: String)