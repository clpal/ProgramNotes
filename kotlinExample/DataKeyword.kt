package Test
data class User(var name :String,var id:Int ,var email :String)
data class Studenta(var name1 :String="noida",var id1:Int =12,var email1 :String)
// https://www.javatpoint.com/kotlin-data-class
fun main() {
   var  user=User("Deepesh",11,"dipesh@gmail.com")
 //  var  user1=Studenta("Deepesh",11,"dipesh@gmail.com")
   var  user1=Studenta("Deepesh",11,"dipesh@gmail.com")
    println(user)
}