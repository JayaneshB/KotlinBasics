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