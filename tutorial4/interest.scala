object interest{
def interests(Deposit:Double):Double =
{if(20000 > Deposit)
    return Deposit*0.02
else if(Deposit < 200000)
     return Deposit*0.04
else if(Deposit < 2000000)
     return Deposit*0.035
else
     return Deposit*0.065
}


def main(args:Array[String]):Unit = {
print("What is the amount  you want to deposit");

var amount = scala.io.StdIn.readDouble();

printf("The interest for the  given amount is %.2f \n",interests(amount));
}

}
