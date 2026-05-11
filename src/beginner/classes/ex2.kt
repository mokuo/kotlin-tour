package beginner.classes

data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)

// Write your code here
data class Name(val firstName: String, val lastName: String)
data class City(val name: String, val country: String)
data class Address(val street: String, val city: City)

fun main() {
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )
}