package kotlin_collection

import java.util.*

fun main() {
      val  array = intArrayOf(9,51,3,16,1,34)
    val number=array.find {
        it%3==0
    }
    print(number)
}

