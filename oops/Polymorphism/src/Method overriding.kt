fun main() {
    val mom=MyMom()
    val daughter=MyDaughter()

    mom.say("Welcome")
    daughter.say("Hello")

}
open class MyMom {
    open fun say(message:String){
        println("Mom says $message")
    }
}
class MyDaughter:MyMom() {
    override fun say(message:String){
        println("Daughter says $message")
    }
}