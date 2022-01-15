package kotlinExample

class Person{
    var name:String ="Chhote"
    var age:Int =32
}

fun main() {
    // sample way
    val person = Person()
    person.age = 32
    person.name = "chhote"
// with
    // return lambda
    // context this
   val after5years =  with(Person()){
         println(name)
         println(age)
         age +5
     }
    print(after5years)
    //apply
    // Return context object
    // Context object : this

     Person().apply {
         age=32
         name="chhote"
     }

}