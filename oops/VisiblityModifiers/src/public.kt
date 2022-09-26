fun main() {

}

open class Car {
    internal val type ="Audi"

    internal fun drive() {
        println("Flying in a car")
    }
}

class MyCar:Car() {
    fun speed() {
        println(type)
        drive()
    }
}
class MyBike {
    fun start() {
        val bike=Car()
        print(bike.type)
        bike.drive()
    }
}
