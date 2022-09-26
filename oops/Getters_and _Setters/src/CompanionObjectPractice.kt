import kotlin.random.Random

fun main() {
    val correctKey=Lock.createKey()
    val myLock=Lock(correctKey)
    myLock.Unlock(correctKey)

    val randomKey=Lock.createKey()
    myLock.Unlock(randomKey)
}
class Lock(key:key) {

    val secretMessage: String

    init {
        secretMessage = generateSecret()
        key.secretCode=secretMessage
    }

    companion object {
        fun createKey() = key()
    }

    fun generateSecret(): String {
        return Random(System.currentTimeMillis()).nextInt().toString()
    }
    fun Unlock(key:key) {
        if(key.secretCode==secretMessage){
            println("Lock is Open")
        }
        else {
            println("Key is not correct")
        }
    }
}

class key {

    var secretCode:String=""
        set(value){
            if(field=="")
                field=value
        }
}