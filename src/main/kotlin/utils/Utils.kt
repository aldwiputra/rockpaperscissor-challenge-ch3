package utils

object Utils {
    fun getString(message: String):String {
        println(message)
        return readLine().orEmpty()
    }

    fun isValidInput(input: String): Boolean {
        return input.lowercase() == "gunting" || input.lowercase() == "kertas" || input.lowercase() == "batu"
    }

    fun printResult(message: String) {
        println("Hasil:")
        println(message)
    }
}