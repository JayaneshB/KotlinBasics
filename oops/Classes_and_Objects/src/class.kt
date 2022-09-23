fun main() {
    // Calling the car class and accessing its method
    val myCar=Car()
    val yourCar=Car()

    myCar.model="BMW"
    yourCar.model="Mercedes"

    myCar.start()
    myCar.drive(250)
    println()

    yourCar.start()
    yourCar.drive(238)
    println()

    // Calling tha animal class and accessing its method
    val creature=Animal()
    creature.run()
    println()

    creature.name="Tiger"
    creature.topSpeed=234
    creature.run()
    println()

    // Calling a math class and its method
    val test=Math()

    println("The sum is : ${test.add(12,34)}")
    println("The difference is : ${test.sub(34,15)}")
    println("The product is : ${test.multiply(87,34)}")
    println("The quotient is : ${test.divide(76,34)}")
    println()

    // Calling the jetpack class for performing the function

    val jp=Jetpack()
    jp.burn(10)
    println("User Height is ${jp.userHeight}")
    jp.burn(70)
    println("User Height is ${jp.userHeight}")
    jp.burn(5)
    println("User Height is ${jp.userHeight}")
    jp.stop(12)
    println("User Height is ${jp.userHeight}")
    jp.stop(0)
    println("User Height is ${jp.userHeight}")
    println()


    //Calling the calculator to perform the following functions
    val cal=Calculator()

    cal.add(2390.3)
    cal.sub(145.7)
    cal.multiply(15.2)
    cal.divide(24.1)
    cal.reset()



}

class Car {
    var model: String?=null
    //var topSpeed=150

    fun start() {
        println("Starting the $model")
    }
    fun drive(speed:Int) {
        println("Driving at the speed of $speed")
    }
}

class Animal {
    var name="Panther "
    var topSpeed=180

    fun run() {
        println("$name runs at the top speed of $topSpeed")
    }
}

class Math {
    fun add(a:Int,b:Int): Int {
        return a+b
    }
    fun sub(a:Int,b:Int): Int {
        return a-b
    }
    fun multiply(a:Int,b:Int): Int {
        return a*b
    }
    fun divide(a:Int,b:Int): Int {
        return a/b
    }
}
class Jetpack {
    var userHeight=0

    fun burn(seconds: Int) {
        println("Burning for $seconds seconds...")
        userHeight+=seconds
    }
    fun stop(seconds:Int) {
        println("Stopping for $seconds seconds...")
        userHeight-=3*seconds
        if(userHeight<=0)
            userHeight=0
    }

}

class Calculator {
    var total=0.0

    fun add(number:Double) {
        total+=number
        println("Total will be: $total")
    }
    fun sub(number:Double) {
        total-=number
        println("Total will be: $total")
    }
    fun multiply(amount:Double)  {
        total*=amount
        println("Total will be: $total")
    }
    fun divide(amount:Double) {
        total/=amount
        println("Total will be: $total")
    }
    fun reset(){
        total=0.0
        println("Total will be: $total")
    }
}




