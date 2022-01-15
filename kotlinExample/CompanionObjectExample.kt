package kotlinExample


class CompanionObjectExample {
    lateinit var Shuow:String
    companion object {
        fun Show(a: String): String {
            return a
        } } }

fun main() {
    val p=CompanionObjectExample.Show("my name ")
    println(p)
}

