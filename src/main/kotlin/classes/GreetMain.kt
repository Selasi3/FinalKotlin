package classes
fun main(){
//instantiating a greeting object
    val greeting = Greeting("Hello, you are welcome", 30)
    println("Example of a greeting object")
    greeting.display()
    //instantiating a greeting object that takes only one parameter
    val greeting2 = Greeting(23);
    println("Example of a greeting object with one parameter")
    println(greeting2.display())


    //instantiating  OnlyPositiveInts object
    val x = OnlyPositiveInts(100)
    println("Example of OnlyPositiveInts object")
   println(x.number)

    //instantiating  GreetingT object
    println("Example ofGreetingT object")
    var greet = GreetingT(GreetingT.defaultGreeting,30)
    print("Count:")
    println(GreetingT.greetingsCount)
    print("Reset count:")
    GreetingT.resetCount()
    println(GreetingT.greetingsCount)




}
