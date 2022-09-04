import User.Player
import utils.Utils

class App {
    private fun printHeader() {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }

    private fun play() {
        val PlayerOne = Player()
        val PlayerTwo = Player()

        PlayerOne.getInputFromPlayer("1")
        PlayerTwo.getInputFromPlayer("2")

        when(PlayerOne.getInputValue().lowercase()) {
            "gunting" -> {
                when(PlayerTwo.getInputValue().lowercase()) {
                    "gunting" -> Utils.printResult("DRAW!")
                    "batu" -> Utils.printResult("Pemain 2 MENANG!")
                    "kertas" -> Utils.printResult("Pemain 1 MENANG!")
                }
            }
            "kertas" -> {
                when(PlayerTwo.getInputValue().lowercase()) {
                    "gunting" -> Utils.printResult("Pemain 2 MENANG!")
                    "batu" -> Utils.printResult("Pemain 1 MENANG!")
                    "kertas" -> Utils.printResult("DRAW!")
                }
            }
            "batu" -> {
                when(PlayerTwo.getInputValue().lowercase()) {
                    "gunting" -> Utils.printResult("Pemain 1 MENANG!")
                    "batu" -> Utils.printResult("DRAW!")
                    "kertas" -> Utils.printResult("Pemain 2 MENANG!")
                }
            }
        }
    }

    fun run() {
        printHeader()
        play()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
}