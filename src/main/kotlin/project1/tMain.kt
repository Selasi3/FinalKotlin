package project1
var funds : Double = 100.0
val pswd = "password"






fun main(){
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            // Each command goes here...
            "balance" -> println(balance())
            "deposit" -> println(deposit(cmd[1].toDouble()))
            "withdraw" -> println(withdraw(cmd[1].toDouble()))
        }
    }
}

fun withdraw(amount: Double): Unit {

    print("Enter Password: ")
    val enterPswd:String = readLine()!!;
    if(enterPswd==pswd){
        if(funds >amount){
            funds-=amount
        }
       else{
           println("Insufficient funds")
        }

    }
    else{
        println("Incorect pasword")
    }


}

fun deposit(amt: Double): Unit {

        funds+=amt
}

fun balance(): Double {


return funds;
}
