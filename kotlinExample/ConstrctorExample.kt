package kotlinExample

class ConstrctorExample(val m: String) {
    init {
        println(m)
    }
    constructor(a: String, b: String) : this(b) {


    }
    constructor(a: String, b: String, c: String) : this(a, b) {

    }
}

fun main() {
    val m = ConstrctorExample("Hello", "world")
    println(m)

}