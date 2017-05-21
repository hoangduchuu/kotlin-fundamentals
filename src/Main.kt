import net.hoangduchuu.Person
import java.util.*

/**
 * Created by hoang on 21/05/2017.
 */


fun main(args: Array<String>) {

    var numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7)

    for (i in 1..5) { // 1 2 3 4 5
        println("hello, world $i");
    }
    println("-----------")
    for (i in 1 until 5) { // 1 2 3 4
        println("hello, world $i");
    }
    println("-----------")
    for (i in 1..10 step 2) { // add step integer
        println("hello, world $i");
    }
    println("-----------")
    for (i in 10 downTo 1 step 2) { // minus step integer
        println("hello, world $i");
    }
    println("\n----print Array-------")
    for (i in numbers) {
        println("hello, world $i");
    }


    var ages = TreeMap<String, Int>()
    ages["huu"] = 22;
    ages["nam"] = 42;
    ages["lan"] = 12;

    println("\n----print TreeMaps Array-------")

    for ((ten, tuoi) in ages) {
        println("$ten is: $tuoi")
    }

    println("\n----print with index an Array-------")
    for ((index, element) in numbers.withIndex()) {
        println("$index is $element")
    }

}
