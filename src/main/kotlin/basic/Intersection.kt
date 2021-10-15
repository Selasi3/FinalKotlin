fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {
    // This function takes the equations of two lines:
    // yOne = mOne * x + cOne and yTwo = mTwo * x + cTwo
    // and prints the X value they intersect at
    // or prints "Don't intersect" if they do not.
    // You only need to check x values between 0 and 100
    for (i in 0..20){
        if(calculateY(mOne,i,cOne)=== calculateY(mTwo,i,cTwo)){
            println(i)

        }
        println("Don't Intersect")

    }
}
fun main(){
//    y = 3x + 5 and y = 4x + 2
    intersection(3,5,4,2)


}
