package intermediate.null_safety

import intermediate.extension_functions.isPositive

fun validateStock(requested: Int?, available: Int?): Int {
    // Write your code here
    if (requested == null) return -1
    if (available == null) return -1
    if (requested < 0) return -1
    if (requested > available) return -1
    
    return requested
}

fun main() {
    println(validateStock(5, 10))
    // 5
    println(validateStock(null, 10))
    // -1
    println(validateStock(-2, 10))
    // -1
}