fun main() {
    val names = arrayOf("John", "Stephen", "Megan")
    println("${names[0]} ${names[1]} ${names[2]}")
    println("${names.size}")

    val mixed = arrayOf<Any>(4,5,6,7, "Name 1", "a")

    for (i in mixed) {
        println("All items: $i")

        if(i is Int) {
            println("Only integers: $i")
        }

        if(i is String) {
            println("Only string: $i")
        }
    }
}