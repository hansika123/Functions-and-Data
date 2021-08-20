object Q4 extends App {

    var bank : List[Account] =
      List( new Account("11140124V" , 1 , -500) , new Account("14578454V" , 2 , 23000), new Account("12478542V",3,40000))

    val find_acc = ( n : Int , b : List[Account]) => b.filter( x => x.accountNumber.equals( n ))

    val negative_bal = ( b : List[Account] ) => b.filter( x => x.balance < 0)

    def  sum(b:List[Account]):Double = b.map (_.balance).sum

    val interest = ( b : List[Account] ) => b.map( x => {
      x.balance match {
        case a if a >= 0 => x deposit x.balance * 0.05
        case _ => x withdraw Math.abs(x.balance) * 0.1
      }
      x
    })


  println("Account details\n")
  printf("bank " + bank )
  println()

  println("\n All Accounts with negative balance ")
  println(negative_bal(bank))

  println("\n Sum of All account balance ")
  println(sum(bank))


  bank = interest( bank )
  println(" \nFinal balances of all accounts after apply the interest ")
  println(sum(bank))
   


}
