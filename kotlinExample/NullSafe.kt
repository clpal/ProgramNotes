package kotlinExample

fun main() {
    val name: String? = "Chhote"
    /*name.let {
        print(name!!.length)
    }*/
    // ternary operator
    /*val len = if (name != null)
        name.length
    else -1*/
    // elvis operator
/*val  len= name?.length ?: -2
    print(len)*/
// non null assertion 100% sure for not null values
    print(name?.length)
}