fun main(){

//a loop with a range expression, to print the points on the line y = 3x - 1 for all integer X between -5 and 5.
    for (i in -5..5){
        var y_value = calculateY(3,i,-1)
        println("$i position of y is $y_value")
    }

}


fun calculateY(m:Int, x:Int, c:Int):Int{
    //y = mx+c - formula for a straight line
    return m*x+c

}
