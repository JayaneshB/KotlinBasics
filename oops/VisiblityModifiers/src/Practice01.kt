fun main() {
    val myLock=EncryptionLock(13)

    println("Does the key 34 unlock my lock: ${myLock.unlock(34)}")
    println("Does the key 12 unlock my lock: ${myLock.unlock(12)}")
    println("Does the key 2 unlock my lock: ${myLock.unlock(2)}")
    println("Does the key 16 unlock my lock: ${myLock.unlock(16)}")
}
class EncryptionLock(private val privateKey:Int) {
    fun unlock(publicKey:Int):Boolean {
        return formula(publicKey)==privateKey
    }
    private fun formula(publicKey:Int)=publicKey / 2+5
}