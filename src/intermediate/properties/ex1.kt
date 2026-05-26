package intermediate.properties

fun findOutOfStockBooks(inventory: List<Int>): List<Int> {
    // Write your code here
    return buildList {
        for (i in inventory.indices) {
            if (inventory[i] == 0) add(i)
        }
    }
}

fun main() {
    val inventory = listOf(3, 0, 7, 0, 5)
    println(findOutOfStockBooks(inventory))
    // [1, 3]
}