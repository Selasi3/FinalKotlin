fun main(){
    println("The two line intersect at the point where x is")
  for(i in 0..10)  {
      //uses the y=calculateY() function in the
      var eqn1 = calculateY(3,i,5)
      var eqn2 = calculateY(4,i,2)

      if(eqn1==eqn2){
          println(i)
      }


  }


}
