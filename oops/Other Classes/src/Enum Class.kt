fun main() {

    //enum classes are used to create a enumeration constants
    // In enum class there are two properties and methods
    //properties->>> ordinal and name
    // methods->>>> values and valueOf

    val color=Color.RED
    when(color){
        Color.RED -> println("Its Red")
        Color.BLUE -> println("Its BLUE")
        Color.GREEN -> println("Its GREEN")
        Color.BLACK -> println("Its BLACK")
        Color.WHITE -> println("Its WHITE ")
    }
}

enum class Color {
    RED,
    BLUE,
    WHITE,
    BLACK,
    GREEN
}