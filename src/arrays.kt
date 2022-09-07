fun main()
{
    //Array declaartion using array constructor
    val ar=Array(10,{i->i*1})
    for (i in 1..ar.size-1)
        println(i)

    //Array declaration using arrayof() function

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


}