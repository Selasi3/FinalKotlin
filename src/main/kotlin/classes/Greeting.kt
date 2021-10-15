package classes

import java.util.*

class Greeting(message:String, userID:Int) {
    val someAtribute = "$message, $userID"

    init {
        println("Configuring greeting: $userID.Message:$message..")
    }
//    Another constructor that takes only one argument
    constructor(userID: Int) : this("Hello", userID) {
        println("Defaulting to Hello greeting")

    }


    var lastGreeted : Date = Date()

    fun display(){
        println(someAtribute)
    }

}