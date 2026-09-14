import javax.xml.crypto.Data

fun main() {
//    val names = listOf<String>("Name 1", "Name 2", "Name 3")
//
//    println(names[0])
//
//    val names2 = mutableListOf<String>("Name 1", "Name 2", "Name 3")
//    names2.add("Name 4")
//    names2.remove("Name 2")
//
//    println(names2)
//
//    names.forEach {println(it)}

//    val names = setOf<String>("Name 1", "Name 2", "Name 3")
//    val mutableNames = mutableSetOf<String>("Name 1", "Name 2", "Name 3")

//    val users = mapOf<Int, String>(1 to "Maria", 2 to "Alex", 10 to "John")
//
//    println(users[10])
//
//    users.forEach { t, u -> println("$t: $u")}

//    val numbersSets = listOf(setOf(1,2,3), setOf(4,5,6), setOf(7,8,9))
//
//    for(numbers in numbersSets) {
//        for(number in numbers) {
//            println(number)
//        }
//        println("\n")
//    }
//
//    val numbersFlatter = numbersSets.flatten()
//    println(numbersFlatter)

//    val numbersStrings = listOf("one", "two", "three", "four")
//    println(numbersStrings.joinToString())
//
//    val listString = StringBuffer("This list of numbers: ")
//    println(numbersStrings.joinTo(listString))
//
//    println(numbersStrings.joinToString ( separator=" | ", prefix ="start: ", postfix=": end"))
//
//    println(numbersStrings.joinToString { "Element: ${it.uppercase()}" })
//
//    val numbers = (1..100).toList()
//    println(numbers.joinToString(limit = 25, truncated = "<...>"))

//    Filters
    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter{it.length > 3}
    println(longerThan3)

    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 101" to 101)
    val filteredMap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }
    println(filteredMap)

    val filteredInx = numbers.filterIndexed{index, value -> (index != 0) && (value.length < 5)}
    println(filteredInx)
    val filteredNot = numbers.filterNot{it.length <= 3}
    println(filteredNot)

    val mixedList = listOf(1,2,3,'A', 'B', 'C', "Hello World", "Alex", false)
    mixedList.filterIsInstance<Char>().forEach{
        println(it)
    }
    mixedList.filterIsInstance<String>().forEach{
        println(it)
    }

//    Partition
    val (match, rest) = numbers.partition{it.length > 3}
    println(rest)
    println(match)

    println(numbers.any {it.endsWith("e")})
    println(numbers.none {it.endsWith("w")})
    println(numbers.all {it.length > 1})
}