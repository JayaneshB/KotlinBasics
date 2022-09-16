fun addition1(a: Int, b: Int): Unit {
    println("${a + b}")
}

fun someOperation(a: Int, b: Int, urwish: (Int, Int) -> Unit) {
    val multiply = a * b
    urwish(multiply, b)
}

fun main() {
    val company = { println("GeeksforGeeks") }
    val add: (Int, Int) -> Unit = { a, b ->
        println("sum: ${a + b}")
    }

    val sum = { a: Int, b: Int ->
        var a1: Int? = null
        a1 = 10
        a + b
        a1
    }

    someOperation(10, 20, add)
//    println("sum: ${sum(1, 2)}")
//    company()
}

