fun main() {
    var str1: String? = calculate(1)
    var str2: String = "dzvsd"
    var str3: String? = null

    if (str1 != null)
        str2 = str1
    str2 = str1 ?: "default value ${str3?.length}"

//    println(str2)


    var c = if (1 > 2) 3 else 5
//    println(c)
    // "null"


//    var i=1
//    while(i<=5){
//        print(" "+i)
//        i++
//    }

    val number: Any? = 4
    var res=when(number){
        number is Int->  {

        }
        number is String->  {

        }
        else ->{

        }
    }
  println(sums(b= 10, a = 2))
}
fun sums(a:Int = 6,b:Int):Int {
     return (a+b)
}


fun calculate(a: Int): String? {
    return if (a % 2 == 0) "cdsc" else null
}