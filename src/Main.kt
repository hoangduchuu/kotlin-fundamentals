import net.hoangduchuu.Person

/**
 * Created by hoang on 21/05/2017.
 */


fun main(args: Array<String>) {
    println("hello, world")
    val q: Question? = null
    q?.Answer = "42"
    q?.display();

    q?.Answer = null //error if String instead of String?

    if (q != null) {
        if (q?.Answer == null) {
            println("null answer!")
        } else {
            println("not null answer!")

        }
    } else {
        println("null cmn q roi")

    }


}

class Question {
    var Answer: String? = ""
    val correctAnswer = "42"
    var Question: String = "what is the answer to life?"

    fun display() {
        println("you said $Answer")
    }
}
