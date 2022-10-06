/*
* Sealed class are related or similar to Enum class both deals with constants but here sealed class acts as an class
* Define a restricted hierarchy
* Abstract by default cannot be instantiated ( when cannot create an object from the sealed class)
* Useful in when expression
* */

fun main(){
    val somePlant=getPlant()
    when(somePlant) {
        is Fruit -> println( "Tasty fruit ")
        is Vegetable -> println(" Tasty vegie !!")
    }
}

fun getPlant():Plant=Apple()

abstract class Plant

sealed class Fruit:Plant()

sealed class Vegetable:Plant()

class Apple: Fruit()

class Potato:Vegetable()
