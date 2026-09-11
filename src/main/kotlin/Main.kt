fun main() {
    sayHello("Alex")
    sayHello("John")

    val hasInternetConnection = true

    if (hasInternetConnection) {
        getData("Some data")
    } else {
        showMessage()
    }

    println(getMax(5,6))
    println(getMax(5.6,9.7))

    println(sum(2,3,4,5,6,7,8,9))
}

fun sayHello(name: String) {
    println("Hello, $name")
}

fun getData(data: String) {
    println("Your data is $data")
}

fun showMessage() {
    println("There is not internet connection")
}

fun getMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun getMax(a: Double, b: Double) = if (a > b) a else b

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }

    numbers.forEach {
        println(it)
    }

    return result
}