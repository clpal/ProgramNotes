package com.kotlin
// Extension fun
class Student{
    fun isPassed(mark: Int): Boolean{
        return mark>40
    }
}
fun Student.isExcellent(mark: Int): Boolean{
    return mark > 90
}
lateinit var f_name: String
fun String.name(f_name:String,l_name:String):String{
    return f_name+l_name
}

fun main(args: Array<String>){
    val student = Student()
    val passingStatus = student.isPassed(55)
    println("student passing status is $passingStatus")

    val excellentStatus = student.isExcellent(95)
    println("student excellent status is $excellentStatus")


    f_name = "Chhote"
    val full_name= f_name?.name("lal","pal")
    println(full_name)
}