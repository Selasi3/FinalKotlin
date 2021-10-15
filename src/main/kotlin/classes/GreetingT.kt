package classes

class GreetingT(message:String, userID:Int) {
    init {
        greetingsCount +=1
    }
    companion object{
        val defaultGreeting:String = "Salut"
        var greetingsCount :Int = 0
        fun resetCount(){
            greetingsCount = 0;
        }
    }
}