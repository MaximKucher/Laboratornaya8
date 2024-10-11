fun checkBet(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}
fun main() {

    val prob = 0.25
    val prize = 100.0
    val pay = 20.0   
    val result = checkBet(prob, prize, pay)
    println("Результат: $result")
}