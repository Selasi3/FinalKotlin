package inheritance


//Class is open for inheritance
//Animal is a parent class
open class Animal(){
    open fun eat(){ }
}

//Bear is a subclass
class Bear():Animal(){
    override fun eat() {
        println("Roar")
    }
}

fun main (){
    val b : Bear = Bear()
    b.eat()
}