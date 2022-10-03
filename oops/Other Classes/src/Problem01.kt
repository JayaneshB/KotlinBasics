fun main() {

    val times= readLine()?:""
    times.toInt()
    for (i in times){
        val price=readLine()?:""
        price.toDouble()
        val quantity=readLine()?:""
        quantity.toInt()
        val country=readLine()?:""
        val productName=readLine()?:""

        val item=Item(price,quantity,country,productName)
        val order=Order(item)
        println(order.getTotal(price.toDouble(),quantity.toInt()))

    }

//    val item=Item(50.00,2,"India","Paper")
//    val order=Order(item)
//    println(order.getTotal(50.00,2))

}

data class Item(val price: String, val quantity: String, val country:String, val name:String)
class Order(val items: Item){
    private var tax=0.3
    fun getTotal(price: Double,quantity: Int):Double {
        return (price*quantity)+(quantity*tax)
    }
}

//(val items: MutableList<Item>)