object Accounts extends App{
  
  
val z = new Account("991941606V","000-000-1118-1024",14548)
val y = new Account("9813432342V","000-000-1118-1234",1231)
val d = new Account("9803432342V","000-000-1118-1145",13432)
val e = new Account("9803431242V","000-000-1118-1212",167432)
var  Bank:List[Account] = List()
Bank = z :: Bank
Bank = y :: Bank
Bank = d ::Bank
Bank = e :: Bank
  
   
val sum = (AcctList:List[Account]) => AcctList.map(x => x._Balance).reduce((x,y) => x + y)

val neg =  (AcctList:List[Account]) => AcctList.filter(x => x._Balance > 0)

val interest = (AcctList:List[Account]) =>  AcctList.map(x => if (x._Balance > 0) x._Balance = x._Balance*1.05 else x._Balance = x._Balance*1.1)
print(neg(Bank))
       

  
  
} 

class Account(NIC:String,AccountNumber:String,Balance:Float)
{
   var _NIC:String   = NIC

   var _AccNo:String =  AccountNumber
   var _Balance:Double =  Balance


   def transfer(amount:Float,Receiver:Account):Unit = {
   if(this._Balance > amount)
   {  this._Balance -= amount 
      Receiver._Balance += amount
      println(s"Your balance is  at ${this._Balance} \nSuccesfully transferred $amount to ${Receiver._AccNo}")

   }
     else{
        println(s"Your Balance is at ${this._Balance}. \nIt is not enough to make a transaction")
     }

}
}