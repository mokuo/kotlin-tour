package intermediate.lambda_expressions_with_receiver

fun List<Int>.incremented(): List<Int> {
    val originalList = this
    return buildList {
        // Write your code here
        for (i in originalList) {
            add(i + 1)
        }
    }
}

fun main() {
    val originalList = listOf(1, 2, 3)
    val newList = originalList.incremented()
    println(newList)
    // [2, 3, 4]
}