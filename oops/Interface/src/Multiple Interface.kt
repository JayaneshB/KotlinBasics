/*
* ---->>> A class can implement multiple interfaces
* ---->>> A interface has no constructor
* ---->>> An interface can implement methods but doesn't need to
* ---->>>An interface cannot initialize values but can update them
* */

interface Pet {
    var cuteness:Int
    fun play()
    fun feed()
}

class Puppy: Pet{
    override var cuteness=100
    override fun play() {
        println("Playing happily")
    }

    override fun feed() {
        println("Eating food slowly and happily ")
    }
}

class Child{
    var pet:Pet
    init {
        val ps=petStore()
    }
    fun raisePet() {
        for (i in 1..pet.cuteness) {
            pet.play()
        }
        pet.feed()
    }
}

class petStore {
    fun getPet() : Pet {
        return Puppy()
    }
}