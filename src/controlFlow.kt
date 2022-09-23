fun main(args:Array<String>) {

    // If else expression

    val num1=12
    val num2=23
    sayHello(listOf())
    val result=if(num1>num2) {
        println("1 is greater than 2")
    }


    else{
        println("2 is greater than 1")
    }
    println(result)

    // If else if else ladder expression

    val n=0
    val rest=if(n>0){
        println("Positive number")
    }
    else if(n<0){
        println("Negative number")
    }
    else{
        println("The number is zero")
    }
    println(rest)

    //Nested If expression

    val a=12
    val b=23
    val c=34

    val res=if(a>b){
        val max=if(a>c){
            a
        }
        else{
            c
        }
        println(max)
    }
    else if(b>c){
        println(b)
    }
    else{
        println(c)
    }
    println(res)

    //When Expression

    val m=2
    val t=when(m){
        1->"hi"
        2->"Hello"
        3->"Bye!"
        else->"Inavlid"
    }
    println(t)

    // for loop

    val arr= arrayOf(1,2,3,4,5,6)
    for(i in arr){
        print(" "+i)
    }
    println()
    for( i in (1..3))
        print(" "+i)
    println()

    val arr2=arrayOf<String>("Java","C","Kotlin","Python","R","C++")
    for(i in arr2)
        print(" "+i)
    println()
    println(arr2[3])

    // While loop

    var i=1
    while(i<13){
        print(" "+i)
        i++
    }
    println()
    //Break Expression

    val q=arrayOf<Int>(1,2,3,4,5,5)
    for( i in q) {
        if (i == 3) {
            break
        }
        println("break " + i)
    }
    println()

    //Continue Expression

    for (i in 1..3) {
        println("cont i = $i")
        if (i == 2) {
            continue
        }
        println("cont Outside if not reach if condition satisfied")
    }

    // downto function
    println("DownTo function :")
    for(n in 5.downTo(1)){
        print(" "+n)
    }

    // step function

    println("Step Function :")
    for (i in 3..10 step 2) {
        print(" " + i)
    }

}