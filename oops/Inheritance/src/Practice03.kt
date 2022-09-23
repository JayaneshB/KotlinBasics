/*A class Job has three variables, name, revenue and salary, and two methods,
work - which increases revenue by the amount in salary
study - which increases salary

Two classes, Engineer and Doctor inherit from the Job class, but have different values for salary.

Create objects and call the functions a few times, printing out messages to see the result of the functions.

*/

fun main() {

    val vip=Engineer()
    val doc=Doctor()

    vip.name="Sneha"
    doc.name="Nikita"

    vip.work()
    vip.study()
    println()

    doc.study()
    doc.study()
    doc.work()
    println()

    // Constructor calling

    val t=Table()
    val t2=Table(2)
    val t3=Table(3,156)

    t.printInfo()
    t2.printInfo()
    t3.printInfo()


}
open class Job {
    var name="Jayanesh"
    var revenue=3456
    var salary=700000

    fun work() {
        salary+=revenue
        println("$name revenue $revenue")
    }
    fun study() {
        salary+=8000
        println("$name salary $salary")
    }
}
class Engineer: Job() {

}
class Doctor :Job() {

}

// Constructor

class Table {
    constructor(){

    }
    constructor(newLegs:Int){
        legs=newLegs
        height=123
    }
    constructor(newLegs:Int,newHeight:Int){
        legs=newLegs
        height=newHeight
    }
    var legs=4
    var height=150
    fun printInfo() {
        println("This table has $legs legs and $height height")
    }
}