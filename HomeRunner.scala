object HomeRunner{

def easy(n:Int):Double = {
return n.toFloat/8
}

def tempo(n:Int):Double = {
return n.toFloat/7
}

def main(args:Array[String]) = {

println("Number of  kilometeres went from easy phase")
var eas = scala.io.StdIn.readInt()
println("Numner of kilometers went form Tempo phase")
var temp = scala.io.StdIn.readInt()
var x = tempo(temp)+easy(eas)
printf("Total time spent to travel home the is : %f",x)

}
}
