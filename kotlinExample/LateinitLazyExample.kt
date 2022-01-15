package kotlinExample

fun main() {

}
class LateinitLazyExample {
    val fistname:String="hello"
    //lateinit var mobileNo:Int // Error Lateinit is allowed for non-primitive data types
   // lateinit val address:String // Error To use a lateinit variable, your variable should use var and NOT val
//lateinit var designation:String="name" //error
   // lateinit var post:String?=null // error
    lateinit var salary:String
 fun  show(){
     salary="pal"
     salary="lal"
     salary="chhote"
 }
    lateinit var department:String

    fun display(){
        department.let {

        }
    }
    var b: String? = null
    fun dog() {
       // print(b.length)  // won't compile, null check is obligatory here
        print(b?.length) // >>> null
        b = "dog"
        print(b?.length) // >>> 3
    }
}