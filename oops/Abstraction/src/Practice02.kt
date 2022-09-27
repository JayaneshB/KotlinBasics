fun main () {
    val oven:DefaultOven=Bosch()
    val roast:DefaultOven=Roaster()

    oven.cooking()
    roast.cooking()


}

abstract class DefaultOven {
    val cookingSpeed=120
    open val averageTemperature=100

    abstract fun cooking()
}
class Bosch:DefaultOven() {
    override val averageTemperature=210
    
    override fun cooking() {
        println("Bosch oven is cooking in $cookingSpeed minutes at $averageTemperature temeperature")
    }
}

class Roaster:DefaultOven() {
    override fun cooking() {
        println("A roaster roasts at $averageTemperature for $cookingSpeed")
    }
}
