import utils.Utils

class App {
    private fun printHeader() {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }

    private fun play() {
        var inputPlayerOne: String = Utils.getString("1. Masukkan pemain 1: ")
        while (!Utils.isValidInput(inputPlayerOne)) {
            println("Input tidak valid!")
            inputPlayerOne = Utils.getString("1. Masukkan pemain 1: ")
        }

        var inputPlayerTwo: String = Utils.getString("2. Masukkan pemain 2: ")
        while (!Utils.isValidInput(inputPlayerTwo)) {
            println("Input tidak valid!")
            inputPlayerTwo = Utils.getString("2. Masukkan pemain 2: ")
        }

        when(inputPlayerOne.lowercase()) {
            "gunting" -> {
                when(inputPlayerTwo.lowercase()) {
                    "gunting" -> Utils.printResult("DRAW!")
                    "batu" -> Utils.printResult("Pemain 2 MENANG!")
                    "kertas" -> Utils.printResult("Pemain 1 MENANG!")
                }
            }
            "kertas" -> {
                when(inputPlayerTwo.lowercase()) {
                    "gunting" -> Utils.printResult("Pemain 2 MENANG!")
                    "batu" -> Utils.printResult("Pemain 1 MENANG!")
                    "kertas" -> Utils.printResult("DRAW!")
                }
            }
            "batu" -> {
                when(inputPlayerTwo.lowercase()) {
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