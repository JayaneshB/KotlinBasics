fun main() {

    val myVehcile=getVehicle()

    when(myVehcile){
        is Car -> println("Drives Faster")
        is Bicycle -> println("It's healthy")
    }

}


fun getVehicle(): Vehicle=MachCity()


abstract class Vehicle

sealed class Car: Vehicle()

sealed class Bicycle: Vehicle()

class BMW: Car()

class MachCity: Bicycle()

