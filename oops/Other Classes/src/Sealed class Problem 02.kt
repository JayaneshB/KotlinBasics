import kotlin.random.Random

/*A lottery returns prizes. It can either return a car, a vacation or a gift card.

A function lottery returns prizes every time it is called. It will randomly return one of the three types of prizes.

Print out a specific message for each type of prize won.

*/

fun main() {
    for(i in 1..3) {
        val prize = lottery()
        when (prize) {
            is Vacation -> println("I'm going on Vacation")
            is car2 -> println("Hurray !! I got a car")
            is GiftCard -> println("I got a coupon")
        }
    }

}

fun lottery(): Prize {
    val number=Random.nextInt(3)
    return when(number) {
        0 -> Maldives()
        1 -> Bugati()
        else -> AmazonGiftCard()

    }
}

sealed class Prize

sealed class car2 : Prize()

sealed class Vacation : Prize()

sealed class GiftCard : Prize()

class Bugati : car2()

class Maldives : Vacation()

class AmazonGiftCard : GiftCard()

