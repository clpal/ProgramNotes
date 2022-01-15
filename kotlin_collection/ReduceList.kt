package kotlin_collection

 //val  newlist= listOf<Int>(1,2,3,4)
fun main() {
     val  number= listOf(1,2,3,4)
    number.reduce {acc: Int ,i:Int->  acc+i }
    println(number)
     val changeNumber=number.reduce { acc, i ->acc+i }
     println(changeNumber)

     val numbers = listOf("one", "two", "three", "four")
     numbers.filter { it.length > 3 }  // nothing happens with `numbers`, result is lost
     println("numbers are still $numbers")
     val longerThan3 = numbers.filter { it.length > 3 } // result is stored in `longerThan3`
     println("numbers longer than 3 chars are $longerThan3")
}