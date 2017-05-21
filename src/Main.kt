/**
 * Created by hoang on 21/05/2017.
 */
@file:JvmName("displayfunctions")


fun main(args: Array<String>) {
    println("hello, world");
    log("log ne", 3)
}

@JvmOverloads
fun log(msg: String, loglevel: Int = 2) = println(msg + " " + loglevel);