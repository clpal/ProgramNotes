package kotlinExample
class InitExample() {


    init {
      println("init block 1")
    }
    init {
        println("init block 2")
    }
    init {
        println("init block 3")
    }
    init {
        println("init block 4")
    }
}
fun main() {
   val initExample= InitExample()
    println(initExample)
}