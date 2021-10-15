package factorial

fun main(){
    var f =1
    val endNum = 5
//    (1..endNum).forEach {f *= it}
    (1..endNum).forEach {i -> f *= i}

    println("factorial suing forEach: $f")

    val f2 = (1..endNum).fold(1){item, sum -> item * sum}
    println("factorial suing forEach: $f2")

}
