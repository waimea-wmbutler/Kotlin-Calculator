fun main () {
    val userName = getString(prompt = "Enter Your Name: ")
    while (true) {
        println("---------------------------------------")
        println("Calculator 7583207583297483265375632753")
        println("---------------------------------------")
        println(            "+ - * - + - *")
        println()
        println("Hello $userName! Let's Do Some MATHS!")
        break
    }

    val num1 = getInt(prompt = "Enter Your First Number ")
    val num2 = getInt(prompt = "Enter Your Operator: (+, -, *, /): ")
    val num1 = getInt(prompt = "Enter Your Second Number ")
    
}
fun getString ( prompt: String): String {
    var userInput: String
    while (true){
        print(prompt)
        userInput = readln()
        if (userInput.isNotBlank()) break
    }
    return userInput
}
fun getInt (prompt: String):Int {
    var intValue: Int?

    while (true) {
        val userInput = getString(prompt)
        val intValue = userInput.toIntOrNull()
        if (intValue != null) break
    }

}
