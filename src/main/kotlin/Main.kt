import javax.xml.crypto.Data

fun main() {
//    val footballTeam = Team<Player>(
//        name = "Barcelona",
//        mutableListOf<FootballPlayer>(FootballPlayer("messi"), FootballPlayer("ronaldo"))
//    )

    val gamesTeam = Team<CounterStrikePlayer>(
        "Games Team",
        mutableListOf<GamesPlayer>(GamesPlayer("Player 1"), GamesPlayer("Player 2"))
    )
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