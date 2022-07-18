object TotalCost{
def  cost(n:Int):Double = {
return 24.96*n
}

def disc(n:Int):Double = {
  return cost(n)*.4
}

def shippingCost(n:Int):Double = {
if(n > 50)
  return (n-50)*.75+50*3

else
 return n*3
}

def Total(n:Int):Double = { cost(n)-disc(n)+shippingCost(n)
}

def main(args:Array[String]) = {

println("Number of copies please:")
var n = scala.io.StdIn.readInt()
var total = Total(n)
printf("The total Cost for the %d copies is %.2f",n ,total)

}}
