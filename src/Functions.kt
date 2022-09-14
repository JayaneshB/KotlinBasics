import java.util.Scanner;

fun String.getAllWords(): List<String>{
    return this.split(" ")
}

infix fun Int.test(n1:Int):Int{
    if(n1>23)
        return n1
    else{
        return 1
    }
}

fun main(){
    val sc=Scanner(System.`in`)
    val str=sc.nextLine()
    val result=str.getAllWords()
    println(result)
    val n1=23
    val n2=34
    val res=n1.test(n2)
    println(res)
}