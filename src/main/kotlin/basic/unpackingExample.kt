fun unpack(money: Int) {

    var costMap: Map<String, Int> = mapOf("AAPL" to 146, "NFLX" to 586)


    for ((ticker, cost) in costMap) {
        println("Buying ${money / cost} $ticker")

    }

}

