
/**
 * Created by hoang on 21/05/2017.
 */

fun display() {
    println("hello, world")
}

fun displayWithParam(msg: String): Boolean { // this will print msg and return true
    println(msg)
    return true
}

fun main(args: Array<String>) {
    display()
    displayWithParam("hello again man!")

    println(max(3,2))

}
