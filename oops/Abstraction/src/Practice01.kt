fun main() {
    val myDog:Dog=Pug("pug")
    val myDog2:Dog=Basset("basset")
    val myDog3:Dog=chihuahua("huahua")

    myDog.play()
    myDog.bark()
    myDog.run()
    println()

    myDog2.play()
    myDog2.run()
    myDog2.bark()
    println()

    myDog3.bark()
    myDog3.run()
    myDog3.play()

}

abstract class Dog(name:String){
    abstract fun run()
    abstract fun bark()
    abstract fun play()
}

class Pug(val name:String):Dog(name){
    override fun run() {
        println("A $name can run ")
    }

    override fun bark() {
        println("A $name cannot bark ")

    }

    override fun play() {
        println("A $name can play ")

    }
}

class Basset(val name:String):Dog(name) {
    override fun run() {
        println("A $name cannot run ")
    }

    override fun bark() {
        println("A $name can bark ")

    }

    override fun play() {
        println("A $name can play ")

    }
}
class chihuahua (val name:String):Dog(name) {
    override fun run() {
        println("A $name can run ")
    }

    override fun bark() {
        println("A $name can bark ")

    }

    override fun play() {
        println("A $name cannot play ")

    }
}