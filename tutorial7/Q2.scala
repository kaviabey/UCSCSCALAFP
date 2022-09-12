object Rational extends App{
class RationalNumber(numer:Int,deno:Int){
  var _Numer:Int = numer
  var _Denom:Int = deno

  def neg:RationalNumber = new RationalNumber(-1*this._Numer,this._Denom)
  override def toString(): String =  s"${this._Numer}/${this._Denom}"
//   s"$this_Numer/$this._Denom"
  def -(y:RationalNumber):RationalNumber  =  this+(y.neg)
  def +(y:RationalNumber):RationalNumber = new RationalNumber((this._Numer*y._Denom)+(y._Numer*this._Denom),this._Denom*y._Denom)
}


val x = new RationalNumber(4,5)
val y = new RationalNumber(6,7)
val z = new RationalNumber(1,2)
val b:RationalNumber = z+y
println(x._Denom)

}

// you dont have to specifically define the main  method  if we extend from the app class