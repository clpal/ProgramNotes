package kotlinExample
val pii:Float= 3.14F
val pi:Float by lazy { 3.14f }
fun main() {
val area1=pi*4*4
    val area2= pi*9*9
    println(area1)
    println(area2)
}