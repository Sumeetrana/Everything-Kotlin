import org.w3c.dom.css.Counter
import javax.xml.crypto.Data

fun main() {
    val footballTeam = Team<Player>(
        "Barcelona",
        mutableListOf<FootballPlayer>(FootballPlayer("Player 1"), FootballPlayer("Player 2"), FootballPlayer("Player 3")))

    val gamesPlayer = Team<GamesPlayer>(
        "Games",
        mutableListOf(CounterStrikePlayer("Player 1"), CounterStrikePlayer("Player 2")),
    )

    addPlayer(CounterStrikePlayer("CSPlayer"))
}

interface Listener {
    fun listen()
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

class Team<T>(val name: String, val players: MutableList<in T>) where T:Player, T: Listener {
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

class FootballPlayer(name: String): Player(name), Listener {
    override fun listen() {

    }
}

class BaseballPlayer(name: String): Player(name)

open class GamesPlayer(name: String): Player(name)

class CounterStrikePlayer(name: String): GamesPlayer(name)

fun <T> addPlayer(player: T) where T: Player, T: Listener {

}