fun main() {
    val n = 27
    val k = 3
    val result = isPowerEqual(n, k)
    println("Результат: $result") 
}

fun isPowerEqual(n: Int, k: Int): Boolean {

    if (k <= 0) return false


    val power = Math.pow(k.toDouble(), k.toDouble()).toInt()


    return power == n
}
