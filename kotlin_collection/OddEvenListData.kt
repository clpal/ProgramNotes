package kotlin_collection

fun main() {
    val listElement = mutableListOf(0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val list = getOddEvenNumberlist(listElement)
    print(list)

}

fun getOddEvenNumberlist(list: MutableList<Int>): MutableList<Int> {
   // val newlist = ArrayList<Int>()
    for (element in list) {
       // for (element in 0..list.size){
        if (element % 2 == 1) {
            list.add(element)
        } /*else {
            newlist.add(element)
        }*/
    }
    return list


}
