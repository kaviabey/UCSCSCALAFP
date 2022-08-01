object pattern{

def patternmatching(x:Int) = x match{
 case x  if x < 0 => println("Negative/Zero");
 case x if x%2 == 0 => println("Even");
 case _ => println("Odd");

}


def main(args:Array[String]):Unit = {

var input  =  scala.io.StdIn.readInt();
patternmatching(input);


}

}
