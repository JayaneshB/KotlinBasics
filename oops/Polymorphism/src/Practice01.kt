fun main() {
    val translate=Translator()
    translate.sayHello("Tam")
    println()

    translate.sayHello("chi")
    println()

    translate.sayHello("Jap")
    println()

    translate.sayHello("Fre")
    println()

    translate.sayHello()
}

class Translator {
    fun sayHello(){
        println("English : Hello!")
    }
    fun sayHello(language:String){
        when(language){
            "Tam" -> println("Tamil : வணக்கம்!!")
            "Fre" -> println("French : Bonjour!")
            "chi" -> println("Chinese : 你好!")
            "Jap" -> println("Japanese : こんにちは!!")
            else -> println("English: Hello")
        }
    }
}