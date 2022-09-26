 fun main() {
    val myParakeet=Parakeet()
     myParakeet.fly()
 }
 open class Bird {
     open val color="Red"
     open val flightSpeed=120

     open fun fly() {
         println("The Bird flies at the speed of $flightSpeed")
     }
 }

 class Parakeet:Bird() {
     override val color="Blue"
     override val flightSpeed=90

     override fun fly() {
         super.fly()
         println("A ${super.color} bird can fly to ${super.flightSpeed} kmph")
     }

 }