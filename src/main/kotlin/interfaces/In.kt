package interfaces

interface Eatable {
    var foodCount : Int
    fun Eat()
    fun printTimesEaten(){
        println("I have eaten ${foodCount} time/s.")
    }
}