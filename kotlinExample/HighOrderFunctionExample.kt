package com.kotlinfun
fun main() {
highOrderAdd(mul)
    val sub=highOrderSub()
    print(sub(8,1))
}
// take parameter type
fun highOrderAdd(lmbd:(Int,Int)->Int){
    val a=lmbd(3,4)
    print(a)
}
// lambda expression
val sum={a:Int,b:Int->a+b}
val mul:(Int,Int)->Int={a,b->a*b}

// have return type fun
fun highOrderSub():(Int,Int)->Int{
    return ::sum
}

fun sum(a:Int,b:Int):Int=a-b
fun sum1(a:Int,b:Int):Int{
    return a-b
}