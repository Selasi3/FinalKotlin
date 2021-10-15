package interfaces

class Bear: Eatable {
    override var foodCount: Int =0


    override fun Eat() {
      foodCount++
        printTimesEaten()
    }
}