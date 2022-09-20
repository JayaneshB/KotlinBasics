/*   Qn from udemy

Create a Higher Order Function that takes a list of client names and a lambda expression that returns a String.

It then applies the lambda expression to every client name, creates a new collection of the results and returns the result.

Create a lambda expression that takes a client name String and returns a personalised message.

Call the HOF and print out the result.

 */

fun udemy(clients:Collection<String>,Lambda:(String)->String): ArrayList<String> {
    val message=arrayListOf<String>()
    for(i in clients){
        message.add(Lambda(i))
    }
    return message
}

fun main() {

    // Qn from udemy

    val clients=arrayListOf("Jayanesh","Hema")
    val mess= udemy(clients){name->"Hello $name ,how are you?"}
    println(clients)
    println(mess)
    println()

    for(i in 0..clients.size-1){
        println("Message for ${clients[i]}")
        println(mess[i])
        println()
    }

    println("Common Higher Order Function using forEach")
    val customers= listOf<String>("Jayanesh","Sneha","Niveda","Hari","Vijay","Sai","Nikita","Arjun")
    customers.forEach{println("Hello $it")}
    println()

    println("Common Higher Order Function using filter ")
    customers.filter{it.length>5}.forEach{println("Hello $it")}
    println()

    println("Common Higher Order Function using map ")
    val size=customers.map{it.length}
    println("Size will be: $size")
    println()

    println("Common Higher Order Function using sortedBy ")
    val sorted=customers.sortedBy { it.length }
    println("sorted Will be: $sorted")
    println()

    println("Common Higher Order Function using maxBy ")
    println("Max will be: ${customers.maxBy{it.length}}")
    println()

    println("Common Higher Order Function using minBy ")
    println("Min will be: ${customers.minBy{it.length}}")
    println()

    
}