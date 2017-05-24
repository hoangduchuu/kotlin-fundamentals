import net.hoangduchuu.Person
import java.math.BigInteger

/**
 * Created by hoang on 21/05/2017.
 */


fun main(args: Array<String>) {
    println(fib(6,BigInteger("1"),BigInteger("0")))


}


tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b
    else fib(n - 1, a + b, a)
}