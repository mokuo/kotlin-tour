package beginner.`control-flow`

import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    // Write your code here

    if (firstResult == secondResult) {
        println("$firstResult, $secondResult")
        println("You win")
    } else {
        println("$firstResult, $secondResult")
        println("You loose")
    }
}