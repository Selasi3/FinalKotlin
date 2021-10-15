package project

class FoodEnvironment(vararg ags :Actor): Environment(*ags) {

    val scores: MutableMap<Actor, Int> = mutableMapOf<Actor,Int>();
    init {
        for (actor in ags){
            this.scores[actor] = 0
        }
    }
    override fun sense(agent: Actor) {
//        TODO("Not yet implemented")
         agent.perceive()
    }

    override fun processAction(agent: Actor, act: Action) {
//        TODO("Not yet implemented")
        when (act){
            is ForageAction -> {
                scores[agent] =  1
            }
            is HuntAction -> {

            }
        }
    }
}