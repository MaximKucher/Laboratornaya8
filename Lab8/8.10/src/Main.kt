fun repeatString(txt: String, n: Int): String {

    if (n <= 0) return ""

    return txt + repeatString(txt, n - 1)
}
fun main() {

    val txt = "хеллоу мир "
    val n = 3
    val result = repeatString(txt, n)
    println("Повторенная строка: $result")
}