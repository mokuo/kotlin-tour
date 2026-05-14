package beginner.classes

// Write your code here
data class OldEmployee(val name: String, var salary: Int)

fun main() {
    val emp = OldEmployee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}