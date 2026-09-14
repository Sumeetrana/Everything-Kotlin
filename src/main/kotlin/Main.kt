fun main() {
    val result = Calculator.sum(5, 10)
    println(Calculator.max)
    println(result)
}

class Calculator {
    companion object {
        var max =  100
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}