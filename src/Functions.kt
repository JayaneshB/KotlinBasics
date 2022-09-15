import java.math.BigInteger
import java.util.Scanner


//Extensive function

fun String.getAllWords(): List<String>{
    return this.split(" ")
}

// Infix function

infix fun Int.test(n1:Int):Int{
    if(n1>23)
        return n1
    else{
        return 1
    }
}
// Infix function

infix fun Int.add(b:Int):Int=this+b

//Recursion call

fun factorial(n:Int):Long {
    if (n==1)
        return n.toLong()
    else
        return n * factorial(n-1)
}

// tail recursion call


tailrec fun fibonacci(num: Int, first: BigInteger, second: BigInteger): BigInteger {
    if(num==0)
        return first
    else
         return fibonacci(num-1,second,first+second)
}

// factorial using tail recursion

tailrec fun fact(numb:Int,run:Int=1):Long {
    if(numb==1)
        return run.toLong()
    else{
        return fact(numb-1,run*numb)
    }
}

//  Default Argument

fun pass(ch:Char='*',length:Int=15):Char{
    for(i in 1..length) {
        print(ch)
    }
    return ch
}
// HigherOrder function

fun add(a:Double,b:Double):Double{
    return a+b
}
fun higherOrder(a:Double,b:Double,fn:(Double,Double)->Double):Double {
    return (fn(a,b))

}

fun main(){

    val sc=Scanner(System.`in`)
    println("Enter the string/word:")
    val str=sc.nextLine()
    val result=str.getAllWords()
    println("The separated string will be:")
    println(result)
    println()


    val x=10 add 20
    println("Sum of the two numbers will be:")
    println(x)
    println()


    val n1=23
    val n2=34
    val res=n1.test(n2)
    println("Result will be:")
    println(res)
    println()


    val number=5
    val temp=factorial(number)
    println("Factorial of th given number will be:")
    println(temp)
    println()

    val num=100
    val first=BigInteger("0")
    val second=BigInteger("1")
    println("Fibonacci will be:")
    println(" "+fibonacci(num,first,second))
    println()

    val numb=5
    val temp2=fact(numb)
    println("Fact of the number will be:")
    println(temp2)
    println()

    // Default argument Passing function call

    println(pass())
    println(pass('$'))
    println(pass('^',12))
    println()

    // Named arguments

    println(pass())
    println(pass(length=12))

    // Higher order function

    val myRes=higherOrder(2.0,3.0,::add)
    println(myRes)
    println()

    //Lambda Function

}



