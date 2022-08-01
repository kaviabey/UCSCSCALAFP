object strings{

def toUpper(txt:String):String = txt.toUpperCase


def toLower(txt:String):String  = txt.toLowerCase

def firsttwoUpper(txt:String):String = {

var test  = txt
var counter = 0
for(i <- txt)
{

   if(counter == 0 || counter == 1)
        test = test.replace(i,i.toUpper)

counter += 1

}

return test;
}

def formatNames(name:String,func:(String) => (String)):String = {

return func(name);


}

def lastUpper(txt:String):String  = {
var test = txt
test = test.replace(test.last,(test.last).toUpper)



return test;

}


def main(args:Array[String]):Unit = {

println(formatNames("Benny",toUpper));
println(formatNames("Niroshan",firsttwoUpper));
println(formatNames("Saman",toLower));
println(formatNames("Kumara",lastUpper));
}


}
