fun generateGoogle(number: Int): String {
    val oCount = if (number < 0) 0 else number 
    return "G${"o".repeat(oCount)}gle"
}
fun main() {
    val number = 3
    val result = generateGoogle(number)
    println(result)
}