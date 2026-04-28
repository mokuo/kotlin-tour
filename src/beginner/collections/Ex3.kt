package beginner.collections

fun main() {
    val number2word = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    val n = 2
    println("$n is spelled as '${number2word[n]}'")
}