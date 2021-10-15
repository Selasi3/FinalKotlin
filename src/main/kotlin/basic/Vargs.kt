

fun multiplyNonZero(vararg iList: Int):Int {
    var total = 1

    for (n in iList.filter { it!=0 }) total*=n
    return total
}
fun main(){
//this function multiply as numbers in the list except 0
    println("Multiplying the numbers in the  list excluding 0 result : ${multiplyNonZero(1,2,3,4,0)}")
}

