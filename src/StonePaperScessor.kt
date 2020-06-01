import java.util.*
open class Game(age1: Int, name1: String, age2: Int, name2: String) {
    init {
        println("First Player name is $name1.")
        println("First Player age is $age1")
        println("Second Player name is $name2.")
        println("Second Player age is $age2")

    }
}

class FirstSetOfPlayers(age1: Int, name1: String, age2: Int, name2: String): Game(age1, name1, age2, name2) {

    fun wantToPlay() {
        val player1pick= randomPick()
        val player2pick= randomPick()
        println("First Player pick $player1pick")
        println("Second Player pick $player2pick")
        if(player1pick=="Scessor" && player2pick=="Scessor") {
            println("Result is : It's a draw")
        }else if(player1pick=="Scessor" && player2pick=="Stone") {
            println("Result is : Second player wins the game as stone will break the Scessor")
        }else if(player1pick=="Scessor" && player2pick=="Paper") {
            println("Result is : First Player wins the game as Scessor will cut the Paper")
        }else if(player1pick=="Stone" && player2pick=="Stone") {
            println("Result is : It's a draw")
        }else if(player1pick=="Stone" && player2pick=="Scessor") {
            println("Result is : First Player wins the game as Stone will break the Scessor")
        }else if(player1pick=="Stone" && player2pick=="Paper") {
            println("Result is : Second Player wins the game as Paper will hold the Stone")
        }else if(player1pick=="Paper" && player2pick=="Paper") {
            println("Result is : It's a draw")
        }else if(player1pick=="Paper" && player2pick=="Scessor") {
            println("Result is : Second Player wins the game as Scessor will cut the Paper")
        }else if(player1pick=="Paper" && player2pick=="Stone") {
            println("Result is : First Player wins the game as Paper will hold the Stone")
        }else{
            println("Result is : It's a draw")
        }
    }
    private fun randomPick() : String {
        val object1 = arrayOf ("Paper", "Stone", "Scessor")
        return object1[Random().nextInt(object1.size)]
    }
}

class SecondSetOfPlayers(age1: Int, name1: String, age2: Int, name2: String): Game(age1, name1, age2, name2) {
    fun dontWantToPlay(reason : String) {
        println("They don't want to play because $reason")
    }
}

fun main(args: Array<String>) {
    val t1 = FirstSetOfPlayers(22, "Siva", 21, "Niki")
    t1.wantToPlay()

    println()

    val t2 = SecondSetOfPlayers(11, "Avish", 12, "Avni")
    t2.dontWantToPlay(reason="they have to prepare for exams")
}