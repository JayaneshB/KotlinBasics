fun main(){
    val note=demo()
    println("Inital message will be:")
    println(note.message)
    println()
    println("Updated message will be :")
    note.updateMessage("Hello Jayanesh")
    println(note.message)
    println()

    // init block
    println("Init block execution will be :")
   val browser=Browser()
    println()

    println("Companion object execution ")
    println(Car.run())

}

class demo {
    var message="Hello_World !!!!"

    fun updateMessage(message:String){
        this.message=message
    }
}

class Browser() {
    init {
        println("Web browser is connecting ")
        println("https://www.google.com")
    }
}
    // Companion objects

class Car {
    companion object{
        fun run():String{
            return "Drive Safe"
        }
    }
}
