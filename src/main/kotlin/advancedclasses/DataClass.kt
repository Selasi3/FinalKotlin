package advancedclasses

data class DataClass(val ticker:String, val strike:Double)


fun main(){
    val opt = DataClass("AAPL",140.0)
    println(1)

    val  (ticker, strike) = opt //Destructuring

    if (DataClass("AAPL", 140.0)==opt){
        println("Equality by Value")

    }else
    {
        println("Oops")
    }

}