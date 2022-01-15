package kotlinExample
class  Student{
    fun hasPassed( marker: Int):Boolean{
        return marker >40
    }
}
 fun Student.schlorship(marker: Int):Boolean{
     return marker>95
 }

fun main() {
  /*    val student:Student= Student()
    println("Student is Passed ${student.hasPassed(57)}")
    println("Student is schloarship ${student.schlorship(57)}")*/
   /* val s1:String="Hello "
    val s2:String="World"
    val s3:String="Hey "
   print( s3.add(s1,s2))*/
    val x:Int=6;
    val y:Int=10;
println(x.greaterValue(y))
}
fun Int.greaterValue(value:Int):Int{
    if (this >value)
        return  this
    else return value
}
fun String.add(s1:String,s2:String):String{
    return this + s1 +s2
}
