//Exception handling
import java.util.Scanner;

fun demo (a:Int,b:Int): Int {
    return try {
        a/b
    }
    /*catch(e:ArithmeticException) {
        println(e)
    }*/
    finally {
        println()
    }
}

fun test(password:String) {
    if(password.length<8)
        throw ArithmeticException("Password is short")
    else
        println("Strong Password")
}

fun main() {
    //Arithmetic exception

    try {
        var num = 10 / 0
    } catch (e: ArithmeticException) {
        println("throws arithmthic expression")
    }

    val temp1 = demo(10, 2)
    println(temp1)
    val temp2 = demo(1, 6)
    println(temp2)

    // Try and finally block

    try {
        val arr = arrayOf(1, 2, 3, 4, 5,"Java")
        val arr2=arrayOf<String>("Java","c","Kotlin")
        val int = arr[3]
        println(int)
    }
    finally{
        println("Excutes by default in the finally block")
    }

    // Try,Catch,Finally block
    try {
        val arr1 = arrayOf(1, 2, 3, 4, 5)
        val int = arr1[6]
        println(int)
    }
    catch(e:Exception){
        println(e)
    }
    finally{
        println("Excutes by default in the finally block")
    }

    // throw keyword

    test("jayanesh")
    //    val str=readLine()
    println("Excutes after validation")


    // Nested try block

    val ls=arrayOf(1,2,3,4)
    try{
        for(i in ls.indices){
            try{
                val n=(0..4).random()
                println(ls[i+1]/n)
            }
            catch(e:ArithmeticException){
                println(e)
            }
        }
    }
    catch(e:ArrayIndexOutOfBoundsException){
        println(e)
    }

    // Multiple catch block

    /*val sc = Scanner(System.in)
    try {
        val n = Integer.parseInt(sc.nextLine())
        if (512 % n == 0)
            println("$n is a factor of 512")
    } catch (e: ArithmeticException) {
        println(e)
    } catch (e: NumberFormatException) {
        println(e)
    }*/


    val a=arrayOf(1,2,3,"Java")
//    a.add("Python")
    for( i in a)
        print(" "+i)
}
