import javax.xml.crypto.Data

fun main() {
    val footballTeam = Team<Player>(
        name = "Barcelona",
        mutableListOf<FootballPlayer>(FootballPlayer("messi"), FootballPlayer("ronaldo"))
    )
}

class Team<T: Player>(val name: String, val players: MutableList<out T>) {
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