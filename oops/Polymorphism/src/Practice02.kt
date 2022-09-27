/*
A TV can provide programs from a certain channel.

It can also provide channel and subtitle information.

It can also provide programs that were shown at a certain time of the day.

Implement this in a program and call the various methods.
*/

fun main() {
    val tv=Tv()

    tv.getChannel("HBO")
    println()

    tv.getChannel("StarMovies",false)
    println()

    tv.getChannel("Cartoon Network",true)
    println()

    tv.getChannel("Star Sports",7)

}

class Tv {

    fun getChannel(name:String){
        println("Regular broadcast $name")
    }

    fun getChannel(name:String,subtitle:Boolean){
        println("Regular broadcast for channel $name")
        if(subtitle)
            println("with subtitle")
        else
            println("without subtitle")
    }

    fun getChannel(name:String,time:Int) {
        println("Broadcast for channel $name at $time time")
    }
}