package ExtensionMethods

fun String.isPalindrome():Boolean{
    if (this.length<=1) return true
    else if (this[0]==this[this.length-1]) return this.slice(1 until this.length-1).isPalindrome()
    else return false
}

fun main(){
    println("racecar".isPalindrome())
    println("alpaca".isPalindrome())
}