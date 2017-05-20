package net.hoangduchuu

/**
 * Created by hoang on 21/05/2017.
 */
class Person(var Name: String = "") {
    fun display(){
        println("display:    ${Name}")
    }

    fun displayWithLambda(func:     (s:String) -> Unit){
        func (Name);
    }
}