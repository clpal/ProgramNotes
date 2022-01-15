package arrary

fun removeElement(nums: IntArray, n:Int) :Int{
     var k:Int=0
 for (item in 0..nums.size-1){
     if (nums[item]!=n){
         nums[k++]=nums[item]
     }
 }

    return k
}
fun main() {
    val nums: IntArray = intArrayOf(3,2,2,3);
    val element=3
val  removeElement=removeElement(nums,element)
    println(removeElement)
}