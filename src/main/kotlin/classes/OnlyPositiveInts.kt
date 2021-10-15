package classes

class OnlyPositiveInts(n:Int) {
    var number :Int =0
    set(value) {field = if (value<0) 0 else value}

    init {
        number =n
    }

}