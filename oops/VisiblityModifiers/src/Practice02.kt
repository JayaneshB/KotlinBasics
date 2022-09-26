/*
A famous fast food restaurant has a secret formula for their burgers.

A franchise of this brand can sell burgers, but does not have access to the formula. They have to ask the original restaurant how to prepare the food.

Implement this in a program, and call the franchise object to provide you with burgers.
*/

fun main() {
    val myRestaurant=Franchise()
    myRestaurant.prepareBurger()

}

open class Original {
    protected fun formula():String {
        return "Prepare food with Love"
    }
}
class Franchise : Original () {
    fun prepareBurger() {
        println("Lets prepare the food with love and according to the formula")
        println(formula())
    }
}