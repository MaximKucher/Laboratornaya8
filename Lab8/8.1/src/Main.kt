fun sumOfList(numbers: List<Int>): Int {
    return numbers.sum()
}
fun main() {
    val numbers = listOf(1, 18, 3, 6, 5)
    val sum = sumOfList(numbers)
    println("Сумма всех элементов списка: $sum")
}