/*
A class Father has a first name and last name. It also has a function that prints out the person’s name.

A class Son inherits from Father and overrides the first name. It also overrides the message function, which now prints out both the name of the person, and the name of the father.

Implement this structure in a program
*/
fun main() {
    val myName=Son()
    myName.print()

}
open class Father {
    open val firstName="Balakrishnan"
    val lastName="R"

    open fun print() {
        println("My name will be $firstName")
    }
}

class Son : Father() {

    override val firstName="Jayanesh"

    override fun print() {
        super.print()
        println("My Father's name will be ${super.firstName}.${super.lastName}")
    }
}