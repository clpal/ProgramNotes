package com.kotlin

val sampleFun = {
    println("hello")
}
val AdditionWithReturn = { a: Int, b: Int -> Int
    val c = a + b
    println(c)
}

val AdditionWithNoReturn={a:Int ,b:Int ->
     a+b

}
var sub = { a: Int, b: Int -> (a - b)
    println(a-b)
}
var mul = { a: Int, b: Int -> val c= a * b
println(c)}
fun main(args: Array<String>) {
    sampleFun()
    AdditionWithReturn(2, 3)
    print( AdditionWithNoReturn(2, 4))
    sub(5, 2)
    mul(20, 3)

}

