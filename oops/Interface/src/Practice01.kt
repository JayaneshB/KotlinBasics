fun main () {
    val restaurant1:Restaurant=LocalRestaurant()

    restaurant1.provideFood()
    restaurant1.provideBill()
    println()

    val restaurant2:Restaurant=FancyRestaurant()

    restaurant2.provideFood()
    restaurant2.provideBill()

}

interface Restaurant {
    fun provideFood()
    fun provideBill()
}

class LocalRestaurant:Restaurant {
    override fun provideFood() {
        println("Provides food and drinks")
    }

    override fun provideBill() {
        println("Please pay the bill amouunr of $25 ")
    }
}

class FancyRestaurant:Restaurant {
    override fun provideFood() {
        println("The delicious food ever ")
    }
    override fun provideBill() {
        println("Please pay the bill of $235")
    }
}