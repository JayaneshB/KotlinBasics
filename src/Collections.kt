//Collections
fun main(){
    //Immutable collections

    // List
    val immutableList=listOf("Jayanesh","Ajay","Vijay")

    //throws an error if we add anything in immutable collection
    //immutableList.add="sneha"

    for (i in immutableList)
    {
        print(" "+i)
    }
    println()
    //Set

    val immutableSet=setOf(1,2,3,2,1,4,5,3,"Jay","Ajay","Santhosh","Gayu","Ajay")
    for( i in immutableSet)
        print(". "+i)
    println()
    //Map

    val immutableMap=mapOf(1 to "Ajay",2 to "Jayanesh")
    for(i in immutableMap)
        print(" "+ i)
    println()

    /*Muttable collection

        List-> MutableList(),arrayListOf() and ArrayList
        Map -> hashMap(),TreeMap(),hashMapOf(),mutableMapOf()
        Set ->mutableSetOf(),hashSet()
     */

    //list collection

    val mutableList= mutableListOf("Java","C","Python")
    mutableList.add("Kotlin")
    mutableList.add("JavaScript")
    for(i in mutableList)
        print(" "+i)
    println()

    val ls=listOf(1,2,3,4,5,6,7,85,9,10)
    println(" "+ls.filter{i->i%2==0})
    println(" "+ls.lastIndexOf(5))
    println(" "+ls.shuffled())

    val ls1= listOf<String>("Jayanesh","java","kotlin","Rajah")
    println(" "+ls1.sortedBy { it.length })
    println(" "+ls1.reversed())

    //Set collection

    val set=mutableSetOf<Int>(1,2,3)
    set.add(98)
    set.add(2)
    set.add(12)
    set.add(3)
    for(i in set)
        print(" "+i)
    println()

    val s1= setOf<Int>(1,4,34,56,21,8)
    val s2=setOf(1,3,23,99,143,54,6,8)
    val temp=s1.union(s2)
    println(" "+temp.sorted())



    // Map collection

    val map=mutableMapOf<Int,String>(7 to "Jayanesh",10 to "Priyanka")
    map.put(13,"Sneha")
    for(i in map)
        print(" "+i)
    println()

    val nm=mapOf("one" to 1,"two" to 2)
    println(nm+Pair("three", 3))
    //println(nm.plus("six",6))
    println(nm+Pair("four",4))
    println(nm+mapOf("five" to 5,"one" to 11))

    // Qn from Udemy

    val prime=setOf(2,3,5,7,11,13,17,19,23,29)
    println(prime.contains(21))
    println(prime.contains(13))
    println()

    val drink1= hashSetOf("Coke","Pepsi","Dew","Beer","Orange juice")
    val drink2= hashSetOf("Coke","Sprite","Dew","ThumpsUp")
    println("Retained Drinks are:")
    drink1.retainAll(drink2)
    println(drink1)
    println()

    var dressCode= hashSetOf("White","Black","Grey")
    val myDressCode= hashSetOf("Green","Black","red","blue")
    println("Retained Dress Code:")
    dressCode.retainAll(myDressCode)
    println(dressCode)

    dressCode= hashSetOf("White","Black","Grey")
    dressCode.add("red")
    println("Updated Dress Code:")
    dressCode.retainAll(myDressCode)
    println(dressCode)
    println()

    var attendance= hashMapOf(Pair("23 Sept",3456),Pair("24 Sept",12345),Pair("25 Sept",6541))
    attendance["26 Sept"]=3451
    val on_25=attendance["25 Sept"]?:0
    val on_26=attendance["26 Sept"]?:0
    println(on_26)
    println(on_25)
    println(attendance.containsKey("22 Sept"))


}
/*
Functions in set and hashset:
    //Hashset

    -->retainAll
    -->clear
    -->isEmpty

    //Set

    --> Size
    --> Contains
    --> containsAll
    -->isEmpty
 */

