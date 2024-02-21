class ATM {
    var balance: Int = 0
    var pinCode: Int = 0
    var selectedChoice: Int = 0
    var money: Int = 0



    fun getCardInformation() {
        print("welcome to our CIB Bank ATM")
        print("Please Enter you PIN Code")
        pinCode = Integer.valueOf(readLine().toString())
        println("Please enter your current Balance")
        balance = Integer.valueOf(readLine().toString())
        selectOperation()

    }

    fun selectOperation(){
        println("Which Operation do ypu want to proced?")
        println("1- Deposit, 2- Withdrawm 3- check Balance, 4- Quit")
        selectedChoice = Integer.valueOf(readLine().toString())
        when (selectedChoice) {
            1 -> deposit()
            2 -> withDrow()
            3 -> checkBalance()
            4 -> println("Thanks for visiting our bank ATM")
        }
    }

    fun deposit() {
        println("How much money you want to deposit?")
        var money: Int
        money = Integer.valueOf(readLine().toString())
        balance += money
        println("Deposit operation done successfully")
        checkBalance()
        doYouNeedAnyThingElse()
    }

    fun withDrow() {
        println("How much money you want to withdrow?")
        money = Integer.valueOf(readLine().toString())
        if (money <= balance){
            balance -= money
            println("Withdrawbdone successfully")
            checkBalance()
            doYouNeedAnyThingElse()
        } else{
            println("Sorry you don't have enough balance")
            doYouNeedAnyThingElse()
        }
    }

    fun checkBalance() {
        println("Your curreny balance is equal to : $balance" )
        doYouNeedAnyThingElse()
    }

    fun doYouNeedAnyThingElse() {

    }
}