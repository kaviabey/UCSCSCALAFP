import scala.io.StdIn.readInt

object test4{
def attendies(price:Int):Int = {
  return (120 + (15-price)*4);
}

def revenue(price:Int):Int = {
  return (price*attendies(price));
}


def cost(price:Int):Int = {
  return 500+attendies(price)*3;
}


def profit(price:Int):Int = {
  return  revenue(price) -  cost(price);
}


def  main(args:Array[String]){

      var x:Int= readInt();

      println(profit(x));




















}


}