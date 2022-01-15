package kotlinExample
class LazyLateinitExample {
 var name:String?=null
lateinit var email:String
   //lazy {  }
}

fun main() {
    lateinit var name:String
    var  id:Int=1
    var address:Any="noida"
    lazy { val name:String?=null }
    lateinit var email:String
    email="chhotelalpal59@gmail.com"
      println(email)
      println(name)
      println(id)
      println(address)
}