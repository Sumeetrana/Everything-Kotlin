import javax.xml.crypto.Data

fun main() {
    val footballPlayer1 = FootballPlayer("Messi")
    val footballPlayer2 = FootballPlayer("Ronaldo")

    val baseballPlayer1 = BaseballPlayer("Bb1")
    val baseballPlayer2 = BaseballPlayer("Bb2")

    val footballTeam = Team("Barcelona", mutableListOf(footballPlayer1))
    footballTeam.addPlayers(footballPlayer2)
    footballTeam.addPlayers(footballPlayer1)

    val baseballTeam = Team("Chicago bulls", mutableListOf(baseballPlayer1))
    baseballTeam.addPlayers(baseballPlayer2)
    baseballTeam.addPlayers(baseballPlayer1)
}

class Team<T>(val name: String, val players: MutableList<T>) {
    fun addPlayers(player: T) {
        if (players.contains(player)) {
            println("Player ${(player as Player).name} is already playing!")
        } else {
            players.add(player)
            println("Player ${(player as Player).name} is added!")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String): Player(name)
class BaseballPlayer(name: String): Player(name)