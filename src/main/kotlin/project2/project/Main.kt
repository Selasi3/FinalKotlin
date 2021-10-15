package project

fun main(){
    val simpleagent = SimpleAgent("Selasi")
    println(simpleagent.toString())
//    println(simpleagent.act())

    val env = FoodEnvironment(SimpleAgent("Charlie"))
    env.step()
    println(env.scores)
}