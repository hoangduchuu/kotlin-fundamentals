import net.hoangduchuu.Person

/**
 * Created by hoang on 21/05/2017.
 */

fun printName(name: String) {
    println(" display Name: " + name)
}

fun main(args: Array<String>) {
    println("hello, world");

    var huu = Person("HuuHoang");

    println("Name is :  ${huu.Name}")

    huu.Name = "Cong Hoang"

    println("Name is :  ${huu.Name}")

    huu.display()

    huu.displayWithLambda(::printName)


}
