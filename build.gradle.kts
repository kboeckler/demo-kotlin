plugins {
    kotlin("jvm") version "2.0.20" // Kotlin version to use
}

group = "com.github.kboeckler.demo" // A company name, for example, `org.jetbrains`
version = "1.0-SNAPSHOT" // Version to assign to the built artifact

repositories { // Sources of dependencies.
    mavenCentral() // Maven Central Repository.
}

dependencies { // All the libraries you want to use.⃣
    // Copy dependencies' names after you find them in a repository
    testImplementation(kotlin("test")) // The Kotlin test library
}

tasks.test {
    useJUnitPlatform() // JUnitPlatform for tests.
}

kotlin { // Extension for easy setup
    jvmToolchain(17) // Target version of generated JVM bytecode.
}
