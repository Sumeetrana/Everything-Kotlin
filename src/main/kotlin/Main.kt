import javax.xml.crypto.Data

fun main() {
    val numbers = (0..13).toList()
    println(numbers.chunked(3))
    println(numbers.chunked(3){ it.sum() })

    println(numbers.windowed(3))
}