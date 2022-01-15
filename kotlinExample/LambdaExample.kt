package kotlinExample

val lambda ={ println("hello")}
val aa={a:Int,b:Int->a+b}
val sum:(Int,Int)->Int={a,b->a+b}
fun main() {
    val x= aa(2,3)
    println(x)
    println(lambda)
    println(sum(2,4))
}