// Reduces code duplication


fun main(){
    val myContainer:Container=Bottle()
    myContainer.pour()

}

abstract class Container() {
    fun pour() {
        println("Pouring the liquid")
    }
}

class Bottle: Container() {
    fun fill () {
        println("Filling Bottle")
    }
}
class Jug : Container() {

}