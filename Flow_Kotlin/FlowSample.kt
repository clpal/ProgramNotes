package Flow_Kotlin

import kotlin.test.assertEquals

//fun sample():List<Int>=listOf(1, 2, 3)

fun main() {
    val numbers: List<Int> = listOf(1, 2, 3)
    val sum: Int = numbers.reduce { acc, next -> acc + next }

    println(sum)
}
