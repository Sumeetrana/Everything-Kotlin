import javax.xml.crypto.Data

fun main() {
    val mixedList = mutableListOf(1,2,3,4,5, 'a', 'b', 'c', 'd', 'e', 'f', "Hello", "World")
    println(getSpecificTypes<Char>(mixedList))
    println(getSpecificTypes<Int>(mixedList))
    println(getSpecificTypes<String>(mixedList))
}

inline fun <reified T> getSpecificTypes(list: List<Any>): List<T> {
    val newList = mutableListOf<T>()

    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }

    return newList
}

class Team<T: Player>(val name: String, val players: MutableList<in T>) {
    fun addPlayers(player: T) {
        if (players.contains(player)) {
            println("Player ${player.name} is already playing!")
        } else {
            players.add(player)
            println("Player ${player.name} is added!")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String): Player(name)
class BaseballPlayer(name: String): Player(name)

open class GamesPlayer(name: String): Player(name)

class CounterStrikePlayer(name: String): GamesPlayer(name)