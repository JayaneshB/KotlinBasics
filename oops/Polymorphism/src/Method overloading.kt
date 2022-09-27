fun main() {
    val test=Test()

    test.print()
    println()
    test.print(4)
    println()
    test.print("Nikita",12)
    println()
    test.print("Jayanesh")
    println()


}

open class Test {
    open fun print(name:String){
        println("Hello $name")
    }
    fun print() {
        println("Hello Sneha")
    }
    fun print(name:String,times:Int){
        for(i in 1..times)
            println("Hello $name")
    }
    fun print(times:Int){
        for(i in 1..times)
            println("Hello")
    }
}