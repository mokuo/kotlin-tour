package Collections

fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "http"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}