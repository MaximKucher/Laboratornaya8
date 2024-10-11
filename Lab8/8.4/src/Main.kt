fun willYouWin(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}
fun main() {
    val prob = 1.0
    val prize = 50.0
    val pay = 10.0
    val result = willYouWin(prob, prize, pay)
    println("Решение: $result")
}