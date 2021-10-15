package casting

fun doSomething(obj:Any) :Unit = when(obj){
    is String -> println(obj.reversed())
    is Int -> println(obj+8)
    is Array <*> -> println("Array of length ${obj.size}")
    else -> println("I didn't recognize that...")
}

fun main(){
    doSomething("Hello")
    doSomething(56)
    doSomething(IntArray(1) {50}.toTypedArray())
    doSomething(0.0F)

}
