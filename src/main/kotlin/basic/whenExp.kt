//using when expression
fun main(){
    var name = getFullName("AAPL");
    println("Full name is : $name ")

}


fun getFullName(ticker :String):String{
    return when(ticker){
        "AAPL" -> "Apple"
        "GOOG","GOOGL" -> "Alphabet"
        else -> "Unrecognised"
    }
}

