fun main() {
    println("Введите первое число")
    var num1 = readLine().toString().toDouble()
    println("Введите второе число")
    var num2 = readLine().toString().toDouble()
    println("Введите операцию")
    var operation = readLine()
    when (operation) {
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "*" -> println(num1 * num2)
        "/" -> println(num1 / num2)
        ":" -> println(num1 / num2)
        "x" -> println(num1 * num2)
    }
}////
