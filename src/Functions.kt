import java.math.BigInteger

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

    /*
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

    */

    //Qn from udemy
    /*for( i in 1..3) {
        multiplyNumber()
    }
    */
    /*for( i in 1..3){
        message()
    }

     */

    /*
    val clients= listOf<String>("Jayanesh","Nikita","Sneha","Prabhakaran")
    sayHello(clients)
     */

    /*
    cost("Iphone",14.99)
    val p= mapOf(Pair("cake",35.65),Pair("Biriyani",25.00))
    cost(p)
     */

    // vararg in function parameter

    println("Sum of the given numbers will be: ")
    println(sum(1,2,3,4,56,7,8,9,8,7,6,5,4,3,2,1))
    println()

    // Lambda Function

    val myName={name:String->println("Hello $name")}

    val names= arrayListOf("Jayanesh","Nikita","Prabha")

    //val myLambda={name:String->println("Hello there $name !!!!!")}
    // we can add the lambda function directly into the function call as a argument
    /* we can also add the array list inside the function call parameter as

            Hello(arrayListOf("Jayanesh","Nikita","Prabha"),{name:String->println("Hello there $name !!!!!")})

     */

    Hello(names,{name:String->println("Hello there $name !!!!!")})
    println()

    // Qn from udemy

    val number= arrayListOf(1,2,3,4,54,32,7,85,4)
    println(number)
    val newNumber=update(number){num->num/10}
    println(newNumber)
    println()


}


// Function Calls
fun multiplyNumber(){
    val input= readLine()?:""
    val number=input.toInt()
    println("The result will be :${number*17}")
}
fun message(){
    println("Enter your name")
    val input=readLine()?:""
    println("Enter DOB")
    val input2=readLine()?:""
    val year=input2.toInt()
    println("$input is ${2022-year} years old")
}

fun sayHello(people:Collection<String>){
    for(i in people){
        println("Hellooo $i")
    }
}
fun cost(product:String, price: Double?){
    println("A $product costs ${price?.times(1.2)}")
}
fun cost(products: Map<String,Double>){
    for(i in products.keys){
        cost(i,products[i])
    }
}
fun sum(vararg s:Int): Int {
    var sum=0
    for(i in s){
        sum+=i
    }
    return sum
}

// Higher Order Function
fun Hello(names:ArrayList<String>,doSomething:(String)->Unit){
    for(i in names){
        doSomething(i)
    }
}

fun update(numbers:ArrayList<Int>,lambda:(Int)->Int): ArrayList<Int> {
    for(i in 0..numbers.size-1){
        if(numbers[i]%2==0)
            numbers[i]=lambda(numbers[i])
    }
    return numbers
}
