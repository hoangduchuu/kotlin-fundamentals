import net.hoangduchuu.Person

/**
 * Created by hoang on 21/05/2017.
 */


fun main(args: Array<String>) {
    println("hello, world")
    var q = Question()
    q.Answer = "42"
    q.Question = ""
    println("match the answer: ${q.Answer}")
}

class Question {
    var Answer: String = ""
    var Question: String = "what is the answer to life?"
}
