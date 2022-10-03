/*
* Data class is created simply to store data
* Primary constructor has atleast one parameter
* Those primary constructor should be initialized with a val or var
* The function block is not required
*/


fun main() {
    val ls=arrayListOf<Customer>()
    ls.add(Customer("Ajay","ajaykrishnan@gmail.com",23))
    ls.add(Customer("Vijay","vijay@yahoo.com",12))
    ls.add(Customer("Nikita","nikitabhatija@gmail.com",13))
    println(ls)
}

data class Customer (
    val name:String,
    val email:String,
    val noOfProduct:Int
)