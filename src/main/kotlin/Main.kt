fun main() {
    var text: String? = "Name"

    println(text?.length)
    text = null
    val text2 = text ?: "The variable is null"
    println(text2)
}