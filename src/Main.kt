/**
 * Created by hoang on 21/05/2017.
 */


fun main(args: Array<String>) {
    println("hello, world");

    log(loglevel = 213, msg = "helloword")

}

fun log(msg: String, loglevel: Int = 12) {
    println(msg + "-- " + loglevel)
}
