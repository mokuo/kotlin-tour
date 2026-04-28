package beginner.control_flow.conditional_expressions

fun main() {
    val button = "B"

    val action = when (button) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Noting"
        else -> "There is no such button"
    }

    println(
        // Write your code here
        println(action)
    )
}