//Creating a open class to inherit its properties and use it in its subordinate class

fun main() {
    val myLaptop=Laptop()
    val myApple=Apple()

    myApple.screenSize=32
    myApple.speed=1580

    myLaptop.run()
    myApple.run()
}
open class Laptop {
    var screenSize=14
    var speed=1440

    fun run() {
        println("Runnig laptop with screensize $screenSize and speeed $speed")
    }
}
class Apple:Laptop() {
    fun feature() {
        println("This contains some additional features when compared to other laptops")
    }
}