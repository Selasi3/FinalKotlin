fun main(args:Array<String>){

//    Using for loop to print 1 to 10
    println("Printing numbers from 1 to 10")
    for (i in 1..10)
        println(i)
    println("Printing numbers between 1 to 30 in steps of 3")
    for (i in 1 ..30 step 3) {
        println(i)
    }
    println("Printing numbers between 50 to 1 in decreasing steps of 3")
    for(i in 50 downTo 1 step 3){
        println(i)
    }

}