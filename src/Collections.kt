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
        print(" "+i)
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


}