fun main() {
    val car=weirdCar()
    car.speed=100
    println(car.name)
    println(car.speed)

}

class weirdCar{
    var name=""
    var speed: Int
        get()=120
        set(value){
            name="High speed car Bently : ${value}"
        }
}