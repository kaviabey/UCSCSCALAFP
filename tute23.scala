import scala.io.StdIn._


object test3{
def  OTC(n:Int):Double = {
return n*85;
}

def WHC(n:Int):Double  = {
return n*250;
} 

def tax(a:Int,b:Int):Double = {
return (OTC(a)+WHC(b))*.12;
}
def homeSalary(a:Int,b:Int):Double = {

return   OTC(a)+WHC(b) - tax(a,b);
}
def main(args:Array[String]){
      var (ot:Int,wh:Int) = (0,0);
         ot = readInt();
         wh = readInt();

   println("The home salary is "+homeSalary(ot,wh));



}
}