package com.string

fun main() {
    val str: String = "abc"

    println(reverse(str))
    val chars = CharArray(str.length)
    str.indices.forEach {
        chars[str.length - it - 1] = str[it]
    }
    print(chars)

}
fun reverse(str:String):String {
    val chars = CharArray(str.length)
    str.indices.forEach {
        chars[str.length - it - 1] = str[it]
    }
    return String(chars)
}
// swapping variable


