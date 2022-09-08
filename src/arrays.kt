
import java.util.*;
fun main()
{
    //Array declaration using array constructor
    val ar=Array(10,{i->i*1})
    for (i in 1..ar.size-1)
        println(i)

    //Array declaration using arrayOf() function

    //Implicit type declaration

    val arr1=arrayOf(1,2,3,4,5)
    for (i in 0..arr1.size-1)
        print(" "+arr1[i])
    println()

    //Explicit type declaration
    val arr2= arrayOf<Int>(1,2,3,4,5,6,7,8,9)
    val arr3=arrayOf<String>("Hello","world")
    for (i in 0..arr2.size-1)
        print(" "+arr2[i])
    println()
    for ( j in 0..arr3.size-1)
        print(" "+arr3[j])

    //Accessing and modifying array values


    val temp=arr1.get(3)
    println(" "+temp)
    arr1.set(1,12)
    for (i in 0..arr1.size-1)
        print(" "+arr1[i])

    //List

    val num=listOf(1,2,3,4,5,6,7,8,9,10)
    for (i in num)
        print(" "+i)
    println()

    //Map
    val names=TreeMap<String,Int>()
    names["Jayanesh"]=22
    names["Jayanth"]=20

    for((name,age) in names){
        println("$name: $age")
    }
    //function
    val res= sum(10,15)
    println(res)
    val result= max(23,76)
    println(result)


}
fun sum(a:Int,b:Int): Int=a+b

fun max(a:Int,b:Int): Int = if(a>b) a else b
