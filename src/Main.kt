import net.hoangduchuu.Person
import java.io.FileReader
import java.io.IOException

/**
 * Created by hoang on 21/05/2017.
 */


fun main(args: Array<String>) {
    println("hello, world");

    var reader = FileReader("filename")
    try {
        reader.read()
    } catch (e: IOException) {
        e.message
    }finally {

    }


}
