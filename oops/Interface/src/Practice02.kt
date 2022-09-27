fun main() {
    val factory=CarFactory()
    val myCar:Car=factory.provideCar()

    myCar.speed=278
    println()
    myCar.drive()
    println()
    myCar.speed()
    println()
    myCar.park()

}

interface Car {
    fun drive()
    fun park()
    fun speed()
    var speed:Int

}

class BMW:Car {

    override var speed: Int=250

    override fun drive() {
        println("Sheer Driving Pleasure...This BMW drives at the speed of $speed")
    }

    override fun speed() {
        println("Lets test the German made Engine!!")
    }

    override fun park() {
        println("Lets Park")
    }
}

class CarFactory {
    fun provideCar():Car {
        return BMW()
    }
}
