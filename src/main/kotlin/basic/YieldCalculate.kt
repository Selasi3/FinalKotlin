fun main(){
    var yield = calculateYield(23.0, 3.0, 3.0)
    println(`yield`)
}
//Declaring a function using an assignment
fun calculateYield(face: Double, coupon:Double, price :Double) = (face*coupon)/price
