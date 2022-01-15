package com.kotlin


fun main() {
    lateinit var address: String
    // Safe call Operater
    address = "Lala Ka purwa"
    var myname = "chhote"
    /*  myname=null //compiler error*/
    var name: String? = "chhote"
    name = null //ok
    println("${name}")

    // checking for null in conditions
    val b: String? = "Kotlin"
    if (b != null && b.length > 0) {
        println("String of length ${b.length}")
    } else {
        println("Empty string")
    }
    // Safe Call
    val a1 = "Kotlin"
    val b1: String? = null
    println(b1?.length)
    println(a1?.length)
    // Let  operator for null safe
    b1?.let { println(it) }
    // elvis  operator for null safe
    // val l: Int = if (b != null) b.length else -1
    val l = b?.length ?: -1
    println("${l}")
    // not-null assertion operator (!!)
    val l1 = b!!.length
    println("not-null length: ${l1}")
    // Safe casts
    //val aInt: Int? = a as? Int

//    Collections of a nullable type
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    print(intList)
}