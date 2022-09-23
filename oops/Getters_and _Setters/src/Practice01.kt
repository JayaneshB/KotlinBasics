fun main() {
    val account=BankAccount()

    account.amount=300
    account.amount=0 
    account.amount=400

}


class BankAccount {
    var rating=500
    var amount: Int=0
        get()=field
        set(value){
            if(value>amount)
                rating++
            else
                rating--
            field=value
            println("New crdit rating is $rating")
        }
}