import java.util.Scanner;

fun test2(password:String) {
    if(password.length<8)
        throw ArithmeticException("Password is short")
    else
        println("Strong Password")
}

fun main(args:Array<String>) {

    //Getting user input from readLine() statement
    println("Enter the text:")
    val str= readLine()
    println("Display the message Shown: $str")

    //Getting input using the Scanner clas in java

    val sc=Scanner(System.`in`)
    //Taking integer as an input

    val num1=sc.nextInt()
    val num2=sc.nextFloat()
    println(num1)
    println(num2)

//    val str1=sc.nextLine()
//    test2(str1)


    //Converting the string to any datatype using the conversion form

    val n=Integer.valueOf(readLine())
    print(n)

}



