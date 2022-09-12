object Account extends App{




val z = new Account("991941606V","000-000-1118-1024",14548)
val y = new Account("9813432342V","000-000-1118-1234",1231)
z.transfer(3222,y)


}
class Account(NIC:String,AccountNumber:String,Balance:Float)
{

   var _NIC:String   = NIC
   var _AccNo:String =  AccountNumber
   var _Balance:Float =  Balance


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