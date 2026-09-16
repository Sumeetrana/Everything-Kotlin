import javax.xml.crypto.Data

fun main() {
    val numbers = mutableListOf(2,5,1,40,20,100,60)
    numbers.sorted().forEach { println(it) }

    val laptops = mutableListOf(
        Laptop("Dell", 2020, 2, 600),
        Laptop("Apple", 2024, 1, 1000),
        Laptop("Acer", 2022, 4, 800),
    )
    println()
    laptops.sorted().forEach { println(it)}
    println()
    laptops.sortedWith(ComparatorRam()).forEach { println(it) }

    println()
    laptops.sortedWith(compareBy {it.year}).forEach { println(it) }

    println()
    laptops.sortedBy{it.ram}.forEach{println(it)}

    println()
    laptops.sortedWith(compareBy<Laptop>{it.year}.thenBy{it.price}).forEach{println(it)}
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int): Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        if(this.price > other.price) return 1
        else if (this.price < other.price) return -1
        return 0
    }
}

class ComparatorRam: Comparator<Laptop> {
    override fun compare(o1: Laptop, o2: Laptop): Int {
        return if (o1.ram > o2.ram) {
            1
        } else if(o1.ram < o2.ram) {
            -1
        } else{
            0
        }
    }
}