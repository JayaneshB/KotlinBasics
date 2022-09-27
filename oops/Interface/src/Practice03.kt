/*
Coffee will wake you up but also quench your thirst. There are different types of coffee, Arabica and Robusta. But since you don’t really care about that, you just go to the coffee shop and ask for a coffee, which they will happily provide.

You will then drink the coffee to both wake you up and quench your thirst.

Implement this in a program.
*/

fun main () {

    val myCoffeeShop=coffeeShop()
    //Declaring a null for the initial value
    var myCoffee:Coffee?=null

    for(i in 1..5){
        myCoffee=myCoffeeShop.purchaseCoffee()
        myCoffee.wakeUp()
        myCoffee.quenchThirst()
        println()
    }

}

interface Coffee {
    fun wakeUp()
    fun quenchThirst()
}

class Latte: Coffee {
    override fun wakeUp() {
        println("Waking You up !!")
    }
    override fun quenchThirst() {
        println("Its taste good and feels fresh")
    }
}

class Arabica:Coffee {
    override fun wakeUp() {
        println("Pretty Good and refreshing")
    }

    override fun quenchThirst() {
        println("Need to try this often")
    }
}

class coffeeShop {
    fun purchaseCoffee() : Coffee {
        val randomNumber=System.currentTimeMillis()
        if(randomNumber%2==0L) {
            return Arabica()
        }
        else {
            return Latte()
        }
    }
}