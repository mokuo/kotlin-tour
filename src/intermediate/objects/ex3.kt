package intermediate.objects

data class Temperature(val celsius: Double) {
    val fahrenheit: Double = celsius * 9 / 5 + 32

    // Write your code here
    companion object {
        fun fromFahrenheit(fahrenheit: Double): Temperature {
            val celsius = (fahrenheit - 32) * 5 / 9
            return Temperature(celsius)
        }
    }
}

fun main() {
    val fahrenheit = 90.0
    val temp = Temperature.fromFahrenheit(fahrenheit)
    println("${temp.celsius}°C is $fahrenheit °F")
    // 32.22222222222222°C is 90.0 °F
}