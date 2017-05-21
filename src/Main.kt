import net.hoangduchuu.Person

/**
 * Created by hoang on 21/05/2017.
 */


fun main(args: Array<String>) {
    println("hello, world")
    var q = Question()
    q.Answer = "42"
    q.Question = ""


    q.display();
    println("the anser is ${q.Answer} ")

    val message = if (q.Answer == q.correctAnswer) {
        "you were corect"
    } else {
        "try again?"
    }
    println(message)


}

class Question {
    var Answer: String = ""
    val correctAnswer = "42"
    var Question: String = "what is the answer to life?"

    fun display() {
        println("you said $Answer")
    }
}
