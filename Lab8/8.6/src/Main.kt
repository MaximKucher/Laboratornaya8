fun isSumLessThan100(num1: Int, num2: Int): Boolean {
    return (num1 + num2) < 100
}
fun main() {

    val number1 = 30
    val number2 = 50
    val result = isSumLessThan100(number1, number2)
    println("Сумма меньше 100: $result") 
}