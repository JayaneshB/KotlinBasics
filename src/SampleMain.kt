fun main() {
    /*val c=800000
    println(c)
    val a:String
    val b:String
    a="Hello World!"
    b="Welcome"
    println(a+" "+b)

    var v1=123
    val v2=v1.toDouble()
    println(v2)*/

    /*val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b:Int= 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b



    println(boxedA === anotherBoxedA)
    println(boxedB === anotherBoxedB)*/

    var string = 12
    var string2: String? = null

    val string1 = addition(1,3)

    val string3 = if(string1==0) "asd" else "advadasvas"


    val s = "hello World!!!"
    for (i in s)
        println(i)

    val str = "Hello guys!,This is Jayanesh Balakrishnan"
    print(str.subSequence(1, 5))
    println()

    //Control Flows
    //If statement
    val a = 7;
    val b = 123;
    val res = if (a > b) {
        print("greater")
    } else {
        print("smaller")
    }
    print(res)
    println()

    //when operator

    val week = 12

    val temp = when (week) {
        1 -> "Friday"
        2 -> "Saturday"
        3 -> "Sunday"
        else -> "Invalid Input"
    }
    println(temp)

    //While Loop

    var i = 0
    while (i < 20) {
        print(" " + i)
        i++
    }





}

fun addition(a: Int, b: Int): Int {
    return a + b
}