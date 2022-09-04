package User

import utils.Utils

class Player {
    private lateinit var inputPlayer: String

    fun getInputFromPlayer(number: String) {
        inputPlayer = Utils.getString("$number. Masukkan pemain $number: ")
        while (!Utils.isValidInput(inputPlayer)) {
            println("Input tidak valid!")
            inputPlayer = Utils.getString("$number. Masukkan pemain $number: ")
        }
    }

    fun getInputValue(): String {
        return inputPlayer
    }
}