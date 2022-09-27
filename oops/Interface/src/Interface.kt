fun main() {
    val myOven:Oven=getOven()

    myOven.turnOn()
    println()

    myOven.cook(123)
    println()
    
    myOven.turnOff()
    println()


}
interface Oven {
    val temp:Int

    fun turnOn()
    fun turnOff()
    fun cook(tem:Int) {
        println("The food is being prepared at the temperature of $tem")
    }
}
class Bosch :Oven{

    override val temp=198
    override fun turnOn() {
        println("Turning on")
    }
    override fun turnOff() {
        println("Turning off")
    }
}
fun getOven():Oven{
    return Bosch()
}