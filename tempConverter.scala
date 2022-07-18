object celcius{
def main(args:Array[String]) = {
println("The temperature you want to convert in celcius")
var temp = scala.io.StdIn.readInt()
var faren = (temp*1.8000)+32.00
printf("The temperature %d in Farenheit is: %.2f",temp,faren)
}
}
